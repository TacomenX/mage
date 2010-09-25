/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 * 
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 * 
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 * 
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 * 
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */

package mage.abilities.effects.common;

import mage.Constants.Outcome;
import mage.Constants.Zone;
import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.cards.Cards;
import mage.cards.CardsImpl;
import mage.filter.FilterCard;
import mage.game.Game;
import mage.players.Player;
import mage.target.TargetCard;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class ScryEffect extends OneShotEffect<ScryEffect> {

	protected static FilterCard filter1 = new FilterCard("card to put on the bottom of your library");
	protected static FilterCard filter2 = new FilterCard("card to put on the top of your library");

	protected int scryNumber;

	public ScryEffect(int scryNumber) {
		super(Outcome.Benefit);
		this.scryNumber = scryNumber;
	}

	public ScryEffect(final ScryEffect effect) {
		super(effect);
		this.scryNumber = effect.scryNumber;
	}

	@Override
	public boolean apply(Game game, Ability source) {
		Player player = game.getPlayer(source.getControllerId());
		Cards cards = new CardsImpl(Zone.PICK);
		for (int i = 0; i < scryNumber; i++) {
			cards.add(player.getLibrary().removeFromTop(game));
		}
		TargetCard target1 = new TargetCard(Zone.PICK, filter1);
		while (cards.size() > 0 && player.chooseTarget(cards, target1, source, game)) {
			Card card = cards.get(target1.getFirstTarget(), game);
			cards.remove(card);
			player.getLibrary().putOnBottom(card, game);
			target1.clearChosen();
		}
		if (cards.size() > 1) {
			TargetCard target2 = new TargetCard(Zone.PICK, filter2);
			target2.setRequired(true);
			while (cards.size() > 1) {
				player.chooseTarget(cards, target2, source, game);
				Card card = cards.get(target2.getFirstTarget(), game);
				cards.remove(card);
				player.getLibrary().putOnTop(card, game);
				target2.clearChosen();
			}
		}
		if (cards.size() == 1)
			player.getLibrary().putOnTop(cards.get(cards.iterator().next(), game), game);
		return true;
	}

	@Override
	public ScryEffect copy() {
		return new ScryEffect(this);
	}

	@Override
	public String getText(Ability source) {
		return "Scry " + scryNumber;
	}

}
