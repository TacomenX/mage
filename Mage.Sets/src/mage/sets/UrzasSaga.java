/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Backfir3
 */
public class UrzasSaga extends ExpansionSet {

    private static final UrzasSaga instance = new UrzasSaga();

    public static UrzasSaga getInstance() {
        return instance;
    }

    private UrzasSaga() {
        super("Urza's Saga", "USG", ExpansionSet.buildDate(1998, 10, 12), SetType.EXPANSION);
        this.blockName = "Urza";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Absolute Grace", 1, Rarity.UNCOMMON, mage.cards.a.AbsoluteGrace.class));
        cards.add(new SetCardInfo("Absolute Law", 2, Rarity.UNCOMMON, mage.cards.a.AbsoluteLaw.class));
        cards.add(new SetCardInfo("Abundance", 229, Rarity.RARE, mage.cards.a.Abundance.class));
        cards.add(new SetCardInfo("Abyssal Horror", 115, Rarity.RARE, mage.cards.a.AbyssalHorror.class));
        cards.add(new SetCardInfo("Academy Researchers", 58, Rarity.UNCOMMON, mage.cards.a.AcademyResearchers.class));
        cards.add(new SetCardInfo("Acidic Soil", 172, Rarity.UNCOMMON, mage.cards.a.AcidicSoil.class));
        cards.add(new SetCardInfo("Acridian", 230, Rarity.COMMON, mage.cards.a.Acridian.class));
        cards.add(new SetCardInfo("Albino Troll", 231, Rarity.UNCOMMON, mage.cards.a.AlbinoTroll.class));
        cards.add(new SetCardInfo("Anaconda", 232, Rarity.UNCOMMON, mage.cards.a.Anaconda.class));
        cards.add(new SetCardInfo("Angelic Chorus", 3, Rarity.RARE, mage.cards.a.AngelicChorus.class));
        cards.add(new SetCardInfo("Angelic Page", 4, Rarity.COMMON, mage.cards.a.AngelicPage.class));
        cards.add(new SetCardInfo("Annul", 59, Rarity.COMMON, mage.cards.a.Annul.class));
        cards.add(new SetCardInfo("Arcane Laboratory", 60, Rarity.UNCOMMON, mage.cards.a.ArcaneLaboratory.class));
        cards.add(new SetCardInfo("Arc Lightning", 174, Rarity.COMMON, mage.cards.a.ArcLightning.class));
        cards.add(new SetCardInfo("Argothian Elder", 233, Rarity.UNCOMMON, mage.cards.a.ArgothianElder.class));
        cards.add(new SetCardInfo("Argothian Enchantress", 234, Rarity.RARE, mage.cards.a.ArgothianEnchantress.class));
        cards.add(new SetCardInfo("Argothian Swine", 235, Rarity.COMMON, mage.cards.a.ArgothianSwine.class));
        cards.add(new SetCardInfo("Argothian Wurm", 236, Rarity.RARE, mage.cards.a.ArgothianWurm.class));
        cards.add(new SetCardInfo("Attunement", 61, Rarity.RARE, mage.cards.a.Attunement.class));
        cards.add(new SetCardInfo("Back to Basics", 62, Rarity.RARE, mage.cards.b.BackToBasics.class));
        cards.add(new SetCardInfo("Barrin, Master Wizard", 63, Rarity.RARE, mage.cards.b.BarrinMasterWizard.class));
        cards.add(new SetCardInfo("Barrin's Codex", 286, Rarity.RARE, mage.cards.b.BarrinsCodex.class));
        cards.add(new SetCardInfo("Bedlam", 175, Rarity.RARE, mage.cards.b.Bedlam.class));
        cards.add(new SetCardInfo("Befoul", 116, Rarity.COMMON, mage.cards.b.Befoul.class));
        cards.add(new SetCardInfo("Bereavement", 117, Rarity.UNCOMMON, mage.cards.b.Bereavement.class));
        cards.add(new SetCardInfo("Blanchwood Armor", 237, Rarity.UNCOMMON, mage.cards.b.BlanchwoodArmor.class));
        cards.add(new SetCardInfo("Blanchwood Treefolk", 238, Rarity.COMMON, mage.cards.b.BlanchwoodTreefolk.class));
        cards.add(new SetCardInfo("Blasted Landscape", 319, Rarity.UNCOMMON, mage.cards.b.BlastedLandscape.class));
        cards.add(new SetCardInfo("Blood Vassal", 118, Rarity.COMMON, mage.cards.b.BloodVassal.class));
        cards.add(new SetCardInfo("Bog Raiders", 119, Rarity.COMMON, mage.cards.b.BogRaiders.class));
        cards.add(new SetCardInfo("Brand", 176, Rarity.RARE, mage.cards.b.Brand.class));
        cards.add(new SetCardInfo("Bravado", 177, Rarity.COMMON, mage.cards.b.Bravado.class));
        cards.add(new SetCardInfo("Breach", 120, Rarity.COMMON, mage.cards.b.Breach.class));
        cards.add(new SetCardInfo("Brilliant Halo", 5, Rarity.COMMON, mage.cards.b.BrilliantHalo.class));
        cards.add(new SetCardInfo("Bull Hippo", 239, Rarity.UNCOMMON, mage.cards.b.BullHippo.class));
        cards.add(new SetCardInfo("Bulwark", 178, Rarity.RARE, mage.cards.b.Bulwark.class));
        cards.add(new SetCardInfo("Cackling Fiend", 121, Rarity.COMMON, mage.cards.c.CacklingFiend.class));
        cards.add(new SetCardInfo("Carpet of Flowers", 240, Rarity.UNCOMMON, mage.cards.c.CarpetOfFlowers.class));
        cards.add(new SetCardInfo("Carrion Beetles", 122, Rarity.COMMON, mage.cards.c.CarrionBeetles.class));
        cards.add(new SetCardInfo("Catalog", 64, Rarity.COMMON, mage.cards.c.Catalog.class));
        cards.add(new SetCardInfo("Catastrophe", 6, Rarity.RARE, mage.cards.c.Catastrophe.class));
        cards.add(new SetCardInfo("Cathodion", 287, Rarity.UNCOMMON, mage.cards.c.Cathodion.class));
        cards.add(new SetCardInfo("Cave Tiger", 241, Rarity.COMMON, mage.cards.c.CaveTiger.class));
        cards.add(new SetCardInfo("Child of Gaea", 242, Rarity.RARE, mage.cards.c.ChildOfGaea.class));
        cards.add(new SetCardInfo("Chimeric Staff", 288, Rarity.RARE, mage.cards.c.ChimericStaff.class));
        cards.add(new SetCardInfo("Citanul Centaurs", 243, Rarity.RARE, mage.cards.c.CitanulCentaurs.class));
        cards.add(new SetCardInfo("Citanul Flute", 289, Rarity.RARE, mage.cards.c.CitanulFlute.class));
        cards.add(new SetCardInfo("Citanul Hierophants", 244, Rarity.RARE, mage.cards.c.CitanulHierophants.class));
        cards.add(new SetCardInfo("Claws of Gix", 290, Rarity.UNCOMMON, mage.cards.c.ClawsOfGix.class));
        cards.add(new SetCardInfo("Clear", 7, Rarity.UNCOMMON, mage.cards.c.Clear.class));
        cards.add(new SetCardInfo("Cloak of Mists", 65, Rarity.COMMON, mage.cards.c.CloakOfMists.class));
        cards.add(new SetCardInfo("Confiscate", 66, Rarity.UNCOMMON, mage.cards.c.Confiscate.class));
        cards.add(new SetCardInfo("Congregate", 8, Rarity.COMMON, mage.cards.c.Congregate.class));
        cards.add(new SetCardInfo("Contamination", 123, Rarity.RARE, mage.cards.c.Contamination.class));
        cards.add(new SetCardInfo("Copper Gnomes", 291, Rarity.RARE, mage.cards.c.CopperGnomes.class));
        cards.add(new SetCardInfo("Coral Merfolk", 67, Rarity.COMMON, mage.cards.c.CoralMerfolk.class));
        cards.add(new SetCardInfo("Corrupt", 124, Rarity.COMMON, mage.cards.c.Corrupt.class));
        cards.add(new SetCardInfo("Cradle Guard", 245, Rarity.UNCOMMON, mage.cards.c.CradleGuard.class));
        cards.add(new SetCardInfo("Crater Hellion", 179, Rarity.RARE, mage.cards.c.CraterHellion.class));
        cards.add(new SetCardInfo("Crazed Skirge", 125, Rarity.UNCOMMON, mage.cards.c.CrazedSkirge.class));
        cards.add(new SetCardInfo("Crosswinds", 246, Rarity.UNCOMMON, mage.cards.c.Crosswinds.class));
        cards.add(new SetCardInfo("Crystal Chimes", 292, Rarity.UNCOMMON, mage.cards.c.CrystalChimes.class));
        cards.add(new SetCardInfo("Curfew", 68, Rarity.COMMON, mage.cards.c.Curfew.class));
        cards.add(new SetCardInfo("Darkest Hour", 128, Rarity.RARE, mage.cards.d.DarkestHour.class));
        cards.add(new SetCardInfo("Dark Hatchling", 126, Rarity.RARE, mage.cards.d.DarkHatchling.class));
        cards.add(new SetCardInfo("Dark Ritual", 127, Rarity.COMMON, mage.cards.d.DarkRitual.class));
        cards.add(new SetCardInfo("Despondency", 129, Rarity.COMMON, mage.cards.d.Despondency.class));
        cards.add(new SetCardInfo("Destructive Urge", 180, Rarity.UNCOMMON, mage.cards.d.DestructiveUrge.class));
        cards.add(new SetCardInfo("Diabolic Servitude", 130, Rarity.UNCOMMON, mage.cards.d.DiabolicServitude.class));
        cards.add(new SetCardInfo("Disciple of Grace", 10, Rarity.COMMON, mage.cards.d.DiscipleOfGrace.class));
        cards.add(new SetCardInfo("Disciple of Law", 11, Rarity.COMMON, mage.cards.d.DiscipleOfLaw.class));
        cards.add(new SetCardInfo("Disenchant", 12, Rarity.COMMON, mage.cards.d.Disenchant.class));
        cards.add(new SetCardInfo("Disorder", 181, Rarity.UNCOMMON, mage.cards.d.Disorder.class));
        cards.add(new SetCardInfo("Disruptive Student", 69, Rarity.COMMON, mage.cards.d.DisruptiveStudent.class));
        cards.add(new SetCardInfo("Douse", 70, Rarity.UNCOMMON, mage.cards.d.Douse.class));
        cards.add(new SetCardInfo("Dragon Blood", 293, Rarity.UNCOMMON, mage.cards.d.DragonBlood.class));
        cards.add(new SetCardInfo("Drifting Djinn", 71, Rarity.RARE, mage.cards.d.DriftingDjinn.class));
        cards.add(new SetCardInfo("Drifting Meadow", 320, Rarity.COMMON, mage.cards.d.DriftingMeadow.class));
        cards.add(new SetCardInfo("Dromosaur", 182, Rarity.COMMON, mage.cards.d.Dromosaur.class));
        cards.add(new SetCardInfo("Duress", 132, Rarity.COMMON, mage.cards.d.Duress.class));
        cards.add(new SetCardInfo("Eastern Paladin", 133, Rarity.RARE, mage.cards.e.EasternPaladin.class));
        cards.add(new SetCardInfo("Elite Archers", 13, Rarity.RARE, mage.cards.e.EliteArchers.class));
        cards.add(new SetCardInfo("Elvish Herder", 247, Rarity.COMMON, mage.cards.e.ElvishHerder.class));
        cards.add(new SetCardInfo("Elvish Lyrist", 248, Rarity.COMMON, mage.cards.e.ElvishLyrist.class));
        cards.add(new SetCardInfo("Endless Wurm", 249, Rarity.RARE, mage.cards.e.EndlessWurm.class));
        cards.add(new SetCardInfo("Endoskeleton", 294, Rarity.UNCOMMON, mage.cards.e.Endoskeleton.class));
        cards.add(new SetCardInfo("Energy Field", 73, Rarity.RARE, mage.cards.e.EnergyField.class));
        cards.add(new SetCardInfo("Exhaustion", 74, Rarity.UNCOMMON, mage.cards.e.Exhaustion.class));
        cards.add(new SetCardInfo("Exhume", 134, Rarity.COMMON, mage.cards.e.Exhume.class));
        cards.add(new SetCardInfo("Exploration", 250, Rarity.RARE, mage.cards.e.Exploration.class));
        cards.add(new SetCardInfo("Expunge", 135, Rarity.COMMON, mage.cards.e.Expunge.class));
        cards.add(new SetCardInfo("Faith Healer", 14, Rarity.RARE, mage.cards.f.FaithHealer.class));
        cards.add(new SetCardInfo("Falter", 184, Rarity.COMMON, mage.cards.f.Falter.class));
        cards.add(new SetCardInfo("Fault Line", 185, Rarity.RARE, mage.cards.f.FaultLine.class));
        cards.add(new SetCardInfo("Fecundity", 251, Rarity.UNCOMMON, mage.cards.f.Fecundity.class));
        cards.add(new SetCardInfo("Fertile Ground", 252, Rarity.COMMON, mage.cards.f.FertileGround.class));
        cards.add(new SetCardInfo("Fiery Mantle", 186, Rarity.COMMON, mage.cards.f.FieryMantle.class));
        cards.add(new SetCardInfo("Fire Ants", 187, Rarity.UNCOMMON, mage.cards.f.FireAnts.class));
        cards.add(new SetCardInfo("Fluctuator", 295, Rarity.RARE, mage.cards.f.Fluctuator.class));
        cards.add(new SetCardInfo("Fog Bank", 75, Rarity.UNCOMMON, mage.cards.f.FogBank.class));
        cards.add(new SetCardInfo("Forest", 347, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 348, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 349, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 350, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Fortitude", 253, Rarity.COMMON, mage.cards.f.Fortitude.class));
        cards.add(new SetCardInfo("Gaea's Bounty", 254, Rarity.COMMON, mage.cards.g.GaeasBounty.class));
        cards.add(new SetCardInfo("Gaea's Cradle", 321, Rarity.RARE, mage.cards.g.GaeasCradle.class));
        cards.add(new SetCardInfo("Gaea's Embrace", 255, Rarity.UNCOMMON, mage.cards.g.GaeasEmbrace.class));
        cards.add(new SetCardInfo("Gamble", 188, Rarity.RARE, mage.cards.g.Gamble.class));
        cards.add(new SetCardInfo("Gilded Drake", 76, Rarity.RARE, mage.cards.g.GildedDrake.class));
        cards.add(new SetCardInfo("Glorious Anthem", 15, Rarity.RARE, mage.cards.g.GloriousAnthem.class));
        cards.add(new SetCardInfo("Goblin Cadets", 189, Rarity.UNCOMMON, mage.cards.g.GoblinCadets.class));
        cards.add(new SetCardInfo("Goblin Lackey", 190, Rarity.UNCOMMON, mage.cards.g.GoblinLackey.class));
        cards.add(new SetCardInfo("Goblin Matron", 191, Rarity.COMMON, mage.cards.g.GoblinMatron.class));
        cards.add(new SetCardInfo("Goblin Offensive", 192, Rarity.UNCOMMON, mage.cards.g.GoblinOffensive.class));
        cards.add(new SetCardInfo("Goblin Patrol", 193, Rarity.COMMON, mage.cards.g.GoblinPatrol.class));
        cards.add(new SetCardInfo("Goblin Raider", 194, Rarity.COMMON, mage.cards.g.GoblinRaider.class));
        cards.add(new SetCardInfo("Goblin Spelunkers", 195, Rarity.COMMON, mage.cards.g.GoblinSpelunkers.class));
        cards.add(new SetCardInfo("Goblin War Buggy", 196, Rarity.COMMON, mage.cards.g.GoblinWarBuggy.class));
        cards.add(new SetCardInfo("Gorilla Warrior", 256, Rarity.COMMON, mage.cards.g.GorillaWarrior.class));
        cards.add(new SetCardInfo("Grafted Skullcap", 296, Rarity.RARE, mage.cards.g.GraftedSkullcap.class));
        cards.add(new SetCardInfo("Greater Good", 257, Rarity.RARE, mage.cards.g.GreaterGood.class));
        cards.add(new SetCardInfo("Great Whale", 77, Rarity.RARE, mage.cards.g.GreatWhale.class));
        cards.add(new SetCardInfo("Guma", 197, Rarity.UNCOMMON, mage.cards.g.Guma.class));
        cards.add(new SetCardInfo("Hawkeater Moth", 259, Rarity.UNCOMMON, mage.cards.h.HawkeaterMoth.class));
        cards.add(new SetCardInfo("Healing Salve", 16, Rarity.COMMON, mage.cards.h.HealingSalve.class));
        cards.add(new SetCardInfo("Heat Ray", 199, Rarity.COMMON, mage.cards.h.HeatRay.class));
        cards.add(new SetCardInfo("Herald of Serra", 17, Rarity.RARE, mage.cards.h.HeraldOfSerra.class));
        cards.add(new SetCardInfo("Hermetic Study", 78, Rarity.COMMON, mage.cards.h.HermeticStudy.class));
        cards.add(new SetCardInfo("Hibernation", 79, Rarity.UNCOMMON, mage.cards.h.Hibernation.class));
        cards.add(new SetCardInfo("Hidden Ancients", 260, Rarity.UNCOMMON, mage.cards.h.HiddenAncients.class));
        cards.add(new SetCardInfo("Hidden Guerrillas", 261, Rarity.UNCOMMON, mage.cards.h.HiddenGuerrillas.class));
        cards.add(new SetCardInfo("Hidden Spider", 264, Rarity.COMMON, mage.cards.h.HiddenSpider.class));
        cards.add(new SetCardInfo("Hollow Dogs", 137, Rarity.COMMON, mage.cards.h.HollowDogs.class));
        cards.add(new SetCardInfo("Horseshoe Crab", 80, Rarity.COMMON, mage.cards.h.HorseshoeCrab.class));
        cards.add(new SetCardInfo("Humble", 18, Rarity.UNCOMMON, mage.cards.h.Humble.class));
        cards.add(new SetCardInfo("Hush", 266, Rarity.COMMON, mage.cards.h.Hush.class));
        cards.add(new SetCardInfo("Ill-Gotten Gains", 138, Rarity.RARE, mage.cards.i.IllGottenGains.class));
        cards.add(new SetCardInfo("Imaginary Pet", 81, Rarity.RARE, mage.cards.i.ImaginaryPet.class));
        cards.add(new SetCardInfo("Intrepid Hero", 19, Rarity.RARE, mage.cards.i.IntrepidHero.class));
        cards.add(new SetCardInfo("Island", 335, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 336, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 337, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 338, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jagged Lightning", 200, Rarity.UNCOMMON, mage.cards.j.JaggedLightning.class));
        cards.add(new SetCardInfo("Karn, Silver Golem", 298, Rarity.RARE, mage.cards.k.KarnSilverGolem.class));
        cards.add(new SetCardInfo("Launch", 82, Rarity.COMMON, mage.cards.l.Launch.class));
        cards.add(new SetCardInfo("Lay Waste", 201, Rarity.COMMON, mage.cards.l.LayWaste.class));
        cards.add(new SetCardInfo("Lifeline", 299, Rarity.RARE, mage.cards.l.Lifeline.class));
        cards.add(new SetCardInfo("Lightning Dragon", 202, Rarity.RARE, mage.cards.l.LightningDragon.class));
        cards.add(new SetCardInfo("Lilting Refrain", 83, Rarity.UNCOMMON, mage.cards.l.LiltingRefrain.class));
        cards.add(new SetCardInfo("Lingering Mirage", 84, Rarity.UNCOMMON, mage.cards.l.LingeringMirage.class));
        cards.add(new SetCardInfo("Looming Shade", 139, Rarity.COMMON, mage.cards.l.LoomingShade.class));
        cards.add(new SetCardInfo("Lotus Blossom", 300, Rarity.RARE, mage.cards.l.LotusBlossom.class));
        cards.add(new SetCardInfo("Lull", 267, Rarity.COMMON, mage.cards.l.Lull.class));
        cards.add(new SetCardInfo("Lurking Evil", 140, Rarity.RARE, mage.cards.l.LurkingEvil.class));
        cards.add(new SetCardInfo("Mana Leech", 141, Rarity.UNCOMMON, mage.cards.m.ManaLeech.class));
        cards.add(new SetCardInfo("Meltdown", 203, Rarity.UNCOMMON, mage.cards.m.Meltdown.class));
        cards.add(new SetCardInfo("Metrognome", 301, Rarity.RARE, mage.cards.m.Metrognome.class));
        cards.add(new SetCardInfo("Midsummer Revel", 268, Rarity.RARE, mage.cards.m.MidsummerRevel.class));
        cards.add(new SetCardInfo("Mishra's Helix", 302, Rarity.RARE, mage.cards.m.MishrasHelix.class));
        cards.add(new SetCardInfo("Mobile Fort", 303, Rarity.UNCOMMON, mage.cards.m.MobileFort.class));
        cards.add(new SetCardInfo("Monk Idealist", 20, Rarity.UNCOMMON, mage.cards.m.MonkIdealist.class));
        cards.add(new SetCardInfo("Monk Realist", 21, Rarity.COMMON, mage.cards.m.MonkRealist.class));
        cards.add(new SetCardInfo("Morphling", 85, Rarity.RARE, mage.cards.m.Morphling.class));
        cards.add(new SetCardInfo("Mountain", 343, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 344, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 345, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 346, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("No Rest for the Wicked", 142, Rarity.UNCOMMON, mage.cards.n.NoRestForTheWicked.class));
        cards.add(new SetCardInfo("Noetic Scales", 304, Rarity.RARE, mage.cards.n.NoeticScales.class));
        cards.add(new SetCardInfo("Okk", 204, Rarity.RARE, mage.cards.o.Okk.class));
        cards.add(new SetCardInfo("Opal Archangel", 23, Rarity.RARE, mage.cards.o.OpalArchangel.class));
        cards.add(new SetCardInfo("Opal Caryatid", 24, Rarity.COMMON, mage.cards.o.OpalCaryatid.class));
        cards.add(new SetCardInfo("Opal Gargoyle", 25, Rarity.COMMON, mage.cards.o.OpalGargoyle.class));
        cards.add(new SetCardInfo("Oppression", 143, Rarity.RARE, mage.cards.o.Oppression.class));
        cards.add(new SetCardInfo("Order of Yawgmoth", 144, Rarity.UNCOMMON, mage.cards.o.OrderOfYawgmoth.class));
        cards.add(new SetCardInfo("Pacifism", 27, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Parasitic Bond", 145, Rarity.UNCOMMON, mage.cards.p.ParasiticBond.class));
        cards.add(new SetCardInfo("Pariah", 28, Rarity.RARE, mage.cards.p.Pariah.class));
        cards.add(new SetCardInfo("Path of Peace", 29, Rarity.COMMON, mage.cards.p.PathOfPeace.class));
        cards.add(new SetCardInfo("Pegasus Charger", 30, Rarity.COMMON, mage.cards.p.PegasusCharger.class));
        cards.add(new SetCardInfo("Pendrell Drake", 86, Rarity.COMMON, mage.cards.p.PendrellDrake.class));
        cards.add(new SetCardInfo("Pendrell Flux", 87, Rarity.COMMON, mage.cards.p.PendrellFlux.class));
        cards.add(new SetCardInfo("Peregrine Drake", 88, Rarity.UNCOMMON, mage.cards.p.PeregrineDrake.class));
        cards.add(new SetCardInfo("Persecute", 146, Rarity.RARE, mage.cards.p.Persecute.class));
        cards.add(new SetCardInfo("Pestilence", 147, Rarity.COMMON, mage.cards.p.Pestilence.class));
        cards.add(new SetCardInfo("Phyrexian Colossus", 305, Rarity.RARE, mage.cards.p.PhyrexianColossus.class));
        cards.add(new SetCardInfo("Phyrexian Ghoul", 148, Rarity.COMMON, mage.cards.p.PhyrexianGhoul.class));
        cards.add(new SetCardInfo("Phyrexian Processor", 306, Rarity.RARE, mage.cards.p.PhyrexianProcessor.class));
        cards.add(new SetCardInfo("Phyrexian Tower", 322, Rarity.RARE, mage.cards.p.PhyrexianTower.class));
        cards.add(new SetCardInfo("Pit Trap", 307, Rarity.UNCOMMON, mage.cards.p.PitTrap.class));
        cards.add(new SetCardInfo("Plains", 331, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 332, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 333, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 334, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Planar Birth", 31, Rarity.RARE, mage.cards.p.PlanarBirth.class));
        cards.add(new SetCardInfo("Planar Void", 149, Rarity.RARE, mage.cards.p.PlanarVoid.class));
        cards.add(new SetCardInfo("Polluted Mire", 323, Rarity.COMMON, mage.cards.p.PollutedMire.class));
        cards.add(new SetCardInfo("Pouncing Jaguar", 269, Rarity.COMMON, mage.cards.p.PouncingJaguar.class));
        cards.add(new SetCardInfo("Power Sink", 89, Rarity.COMMON, mage.cards.p.PowerSink.class));
        cards.add(new SetCardInfo("Presence of the Master", 32, Rarity.UNCOMMON, mage.cards.p.PresenceOfTheMaster.class));
        cards.add(new SetCardInfo("Priest of Gix", 150, Rarity.UNCOMMON, mage.cards.p.PriestOfGix.class));
        cards.add(new SetCardInfo("Priest of Titania", 270, Rarity.COMMON, mage.cards.p.PriestOfTitania.class));
        cards.add(new SetCardInfo("Rain of Filth", 151, Rarity.UNCOMMON, mage.cards.r.RainOfFilth.class));
        cards.add(new SetCardInfo("Rain of Salt", 206, Rarity.UNCOMMON, mage.cards.r.RainOfSalt.class));
        cards.add(new SetCardInfo("Ravenous Skirge", 152, Rarity.COMMON, mage.cards.r.RavenousSkirge.class));
        cards.add(new SetCardInfo("Raze", 207, Rarity.COMMON, mage.cards.r.Raze.class));
        cards.add(new SetCardInfo("Redeem", 33, Rarity.UNCOMMON, mage.cards.r.Redeem.class));
        cards.add(new SetCardInfo("Reflexes", 208, Rarity.COMMON, mage.cards.r.Reflexes.class));
        cards.add(new SetCardInfo("Rejuvenate", 271, Rarity.COMMON, mage.cards.r.Rejuvenate.class));
        cards.add(new SetCardInfo("Remembrance", 34, Rarity.RARE, mage.cards.r.Remembrance.class));
        cards.add(new SetCardInfo("Remote Isle", 324, Rarity.COMMON, mage.cards.r.RemoteIsle.class));
        cards.add(new SetCardInfo("Reprocess", 154, Rarity.RARE, mage.cards.r.Reprocess.class));
        cards.add(new SetCardInfo("Rescind", 92, Rarity.COMMON, mage.cards.r.Rescind.class));
        cards.add(new SetCardInfo("Retaliation", 272, Rarity.UNCOMMON, mage.cards.r.Retaliation.class));
        cards.add(new SetCardInfo("Rewind", 93, Rarity.COMMON, mage.cards.r.Rewind.class));
        cards.add(new SetCardInfo("Rune of Protection: Artifacts", 35, Rarity.UNCOMMON, mage.cards.r.RuneOfProtectionArtifacts.class));
        cards.add(new SetCardInfo("Rune of Protection: Black", 36, Rarity.COMMON, mage.cards.r.RuneOfProtectionBlack.class));
        cards.add(new SetCardInfo("Rune of Protection: Blue", 37, Rarity.COMMON, mage.cards.r.RuneOfProtectionBlue.class));
        cards.add(new SetCardInfo("Rune of Protection: Green", 38, Rarity.COMMON, mage.cards.r.RuneOfProtectionGreen.class));
        cards.add(new SetCardInfo("Rune of Protection: Lands", 39, Rarity.RARE, mage.cards.r.RuneOfProtectionLands.class));
        cards.add(new SetCardInfo("Rune of Protection: Red", 40, Rarity.COMMON, mage.cards.r.RuneOfProtectionRed.class));
        cards.add(new SetCardInfo("Rune of Protection: White", 41, Rarity.COMMON, mage.cards.r.RuneOfProtectionWhite.class));
        cards.add(new SetCardInfo("Sanctum Custodian", 42, Rarity.COMMON, mage.cards.s.SanctumCustodian.class));
        cards.add(new SetCardInfo("Sanctum Guardian", 43, Rarity.UNCOMMON, mage.cards.s.SanctumGuardian.class));
        cards.add(new SetCardInfo("Sandbar Merfolk", 94, Rarity.COMMON, mage.cards.s.SandbarMerfolk.class));
        cards.add(new SetCardInfo("Sandbar Serpent", 95, Rarity.UNCOMMON, mage.cards.s.SandbarSerpent.class));
        cards.add(new SetCardInfo("Sanguine Guard", 155, Rarity.UNCOMMON, mage.cards.s.SanguineGuard.class));
        cards.add(new SetCardInfo("Scald", 211, Rarity.UNCOMMON, mage.cards.s.Scald.class));
        cards.add(new SetCardInfo("Scoria Wurm", 212, Rarity.RARE, mage.cards.s.ScoriaWurm.class));
        cards.add(new SetCardInfo("Scrap", 213, Rarity.COMMON, mage.cards.s.Scrap.class));
        cards.add(new SetCardInfo("Seasoned Marshal", 44, Rarity.UNCOMMON, mage.cards.s.SeasonedMarshal.class));
        cards.add(new SetCardInfo("Serra Avatar", 45, Rarity.RARE, mage.cards.s.SerraAvatar.class));
        cards.add(new SetCardInfo("Serra's Embrace", 47, Rarity.UNCOMMON, mage.cards.s.SerrasEmbrace.class));
        cards.add(new SetCardInfo("Serra's Sanctum", 325, Rarity.RARE, mage.cards.s.SerrasSanctum.class));
        cards.add(new SetCardInfo("Serra Zealot", 46, Rarity.COMMON, mage.cards.s.SerraZealot.class));
        cards.add(new SetCardInfo("Shimmering Barrier", 50, Rarity.UNCOMMON, mage.cards.s.ShimmeringBarrier.class));
        cards.add(new SetCardInfo("Shivan Gorge", 326, Rarity.RARE, mage.cards.s.ShivanGorge.class));
        cards.add(new SetCardInfo("Shivan Hellkite", 214, Rarity.RARE, mage.cards.s.ShivanHellkite.class));
        cards.add(new SetCardInfo("Shivan Raptor", 215, Rarity.UNCOMMON, mage.cards.s.ShivanRaptor.class));
        cards.add(new SetCardInfo("Shiv's Embrace", 216, Rarity.UNCOMMON, mage.cards.s.ShivsEmbrace.class));
        cards.add(new SetCardInfo("Show and Tell", 96, Rarity.RARE, mage.cards.s.ShowAndTell.class));
        cards.add(new SetCardInfo("Shower of Sparks", 217, Rarity.COMMON, mage.cards.s.ShowerOfSparks.class));
        cards.add(new SetCardInfo("Sicken", 156, Rarity.COMMON, mage.cards.s.Sicken.class));
        cards.add(new SetCardInfo("Silent Attendant", 51, Rarity.COMMON, mage.cards.s.SilentAttendant.class));
        cards.add(new SetCardInfo("Skirge Familiar", 157, Rarity.UNCOMMON, mage.cards.s.SkirgeFamiliar.class));
        cards.add(new SetCardInfo("Skittering Skirge", 158, Rarity.COMMON, mage.cards.s.SkitteringSkirge.class));
        cards.add(new SetCardInfo("Sleeper Agent", 159, Rarity.RARE, mage.cards.s.SleeperAgent.class));
        cards.add(new SetCardInfo("Slippery Karst", 327, Rarity.COMMON, mage.cards.s.SlipperyKarst.class));
        cards.add(new SetCardInfo("Smokestack", 309, Rarity.RARE, mage.cards.s.Smokestack.class));
        cards.add(new SetCardInfo("Smoldering Crater", 328, Rarity.COMMON, mage.cards.s.SmolderingCrater.class));
        cards.add(new SetCardInfo("Sneak Attack", 218, Rarity.RARE, mage.cards.s.SneakAttack.class));
        cards.add(new SetCardInfo("Spined Fluke", 160, Rarity.UNCOMMON, mage.cards.s.SpinedFluke.class));
        cards.add(new SetCardInfo("Spire Owl", 98, Rarity.COMMON, mage.cards.s.SpireOwl.class));
        cards.add(new SetCardInfo("Spreading Algae", 274, Rarity.UNCOMMON, mage.cards.s.SpreadingAlgae.class));
        cards.add(new SetCardInfo("Steam Blast", 219, Rarity.UNCOMMON, mage.cards.s.SteamBlast.class));
        cards.add(new SetCardInfo("Stern Proctor", 99, Rarity.UNCOMMON, mage.cards.s.SternProctor.class));
        cards.add(new SetCardInfo("Stroke of Genius", 100, Rarity.RARE, mage.cards.s.StrokeOfGenius.class));
        cards.add(new SetCardInfo("Sunder", 101, Rarity.RARE, mage.cards.s.Sunder.class));
        cards.add(new SetCardInfo("Swamp", 339, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 340, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 341, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 342, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Symbiosis", 275, Rarity.COMMON, mage.cards.s.Symbiosis.class));
        cards.add(new SetCardInfo("Tainted Aether", 161, Rarity.RARE, mage.cards.t.TaintedAether.class));
        cards.add(new SetCardInfo("Telepathy", 102, Rarity.UNCOMMON, mage.cards.t.Telepathy.class));
        cards.add(new SetCardInfo("Thran Quarry", 329, Rarity.RARE, mage.cards.t.ThranQuarry.class));
        cards.add(new SetCardInfo("Thran Turbine", 311, Rarity.UNCOMMON, mage.cards.t.ThranTurbine.class));
        cards.add(new SetCardInfo("Thundering Giant", 221, Rarity.UNCOMMON, mage.cards.t.ThunderingGiant.class));
        cards.add(new SetCardInfo("Time Spiral", 103, Rarity.RARE, mage.cards.t.TimeSpiral.class));
        cards.add(new SetCardInfo("Titania's Boon", 276, Rarity.UNCOMMON, mage.cards.t.TitaniasBoon.class));
        cards.add(new SetCardInfo("Titania's Chosen", 277, Rarity.UNCOMMON, mage.cards.t.TitaniasChosen.class));
        cards.add(new SetCardInfo("Tolarian Academy", 330, Rarity.RARE, mage.cards.t.TolarianAcademy.class));
        cards.add(new SetCardInfo("Tolarian Winds", 104, Rarity.COMMON, mage.cards.t.TolarianWinds.class));
        cards.add(new SetCardInfo("Torch Song", 222, Rarity.UNCOMMON, mage.cards.t.TorchSong.class));
        cards.add(new SetCardInfo("Treefolk Seedlings", 278, Rarity.UNCOMMON, mage.cards.t.TreefolkSeedlings.class));
        cards.add(new SetCardInfo("Treetop Rangers", 279, Rarity.COMMON, mage.cards.t.TreetopRangers.class));
        cards.add(new SetCardInfo("Turnabout", 105, Rarity.UNCOMMON, mage.cards.t.Turnabout.class));
        cards.add(new SetCardInfo("Umbilicus", 312, Rarity.RARE, mage.cards.u.Umbilicus.class));
        cards.add(new SetCardInfo("Unnerve", 162, Rarity.COMMON, mage.cards.u.Unnerve.class));
        cards.add(new SetCardInfo("Unworthy Dead", 163, Rarity.COMMON, mage.cards.u.UnworthyDead.class));
        cards.add(new SetCardInfo("Urza's Armor", 313, Rarity.UNCOMMON, mage.cards.u.UrzasArmor.class));
        cards.add(new SetCardInfo("Vampiric Embrace", 164, Rarity.UNCOMMON, mage.cards.v.VampiricEmbrace.class));
        cards.add(new SetCardInfo("Vernal Bloom", 281, Rarity.RARE, mage.cards.v.VernalBloom.class));
        cards.add(new SetCardInfo("Viashino Outrider", 223, Rarity.COMMON, mage.cards.v.ViashinoOutrider.class));
        cards.add(new SetCardInfo("Viashino Runner", 224, Rarity.COMMON, mage.cards.v.ViashinoRunner.class));
        cards.add(new SetCardInfo("Viashino Sandswimmer", 225, Rarity.RARE, mage.cards.v.ViashinoSandswimmer.class));
        cards.add(new SetCardInfo("Viashino Weaponsmith", 226, Rarity.COMMON, mage.cards.v.ViashinoWeaponsmith.class));
        cards.add(new SetCardInfo("Victimize", 166, Rarity.UNCOMMON, mage.cards.v.Victimize.class));
        cards.add(new SetCardInfo("Vile Requiem", 167, Rarity.UNCOMMON, mage.cards.v.VileRequiem.class));
        cards.add(new SetCardInfo("Voice of Grace", 54, Rarity.UNCOMMON, mage.cards.v.VoiceOfGrace.class));
        cards.add(new SetCardInfo("Voice of Law", 55, Rarity.UNCOMMON, mage.cards.v.VoiceOfLaw.class));
        cards.add(new SetCardInfo("Voltaic Key", 314, Rarity.UNCOMMON, mage.cards.v.VoltaicKey.class));
        cards.add(new SetCardInfo("Vug Lizard", 227, Rarity.UNCOMMON, mage.cards.v.VugLizard.class));
        cards.add(new SetCardInfo("Western Paladin", 168, Rarity.RARE, mage.cards.w.WesternPaladin.class));
        cards.add(new SetCardInfo("Whetstone", 316, Rarity.RARE, mage.cards.w.Whetstone.class));
        cards.add(new SetCardInfo("Whirlwind", 283, Rarity.RARE, mage.cards.w.Whirlwind.class));
        cards.add(new SetCardInfo("Wild Dogs", 284, Rarity.COMMON, mage.cards.w.WildDogs.class));
        cards.add(new SetCardInfo("Wildfire", 228, Rarity.RARE, mage.cards.w.Wildfire.class));
        cards.add(new SetCardInfo("Windfall", 111, Rarity.UNCOMMON, mage.cards.w.Windfall.class));
        cards.add(new SetCardInfo("Winding Wurm", 285, Rarity.COMMON, mage.cards.w.WindingWurm.class));
        cards.add(new SetCardInfo("Wirecat", 317, Rarity.UNCOMMON, mage.cards.w.Wirecat.class));
        cards.add(new SetCardInfo("Witch Engine", 169, Rarity.RARE, mage.cards.w.WitchEngine.class));
        cards.add(new SetCardInfo("Wizard Mentor", 112, Rarity.COMMON, mage.cards.w.WizardMentor.class));
        cards.add(new SetCardInfo("Worn Powerstone", 318, Rarity.UNCOMMON, mage.cards.w.WornPowerstone.class));
        cards.add(new SetCardInfo("Worship", 57, Rarity.RARE, mage.cards.w.Worship.class));
        cards.add(new SetCardInfo("Yawgmoth's Edict", 170, Rarity.UNCOMMON, mage.cards.y.YawgmothsEdict.class));
        cards.add(new SetCardInfo("Yawgmoth's Will", 171, Rarity.RARE, mage.cards.y.YawgmothsWill.class));
        cards.add(new SetCardInfo("Zephid", 113, Rarity.RARE, mage.cards.z.Zephid.class));
        cards.add(new SetCardInfo("Zephid's Embrace", 114, Rarity.UNCOMMON, mage.cards.z.ZephidsEmbrace.class));
    }
}
