/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package tms.chabry.auroria;

import tms.chabry.auroria.init.AuroriaModTabs;
import tms.chabry.auroria.init.AuroriaModProcedures;
import tms.chabry.auroria.init.AuroriaModMobEffects;
import tms.chabry.auroria.init.AuroriaModItems;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

public class AuroriaMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "auroria";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing AuroriaMod");
		AuroriaModTabs.load();

		AuroriaModMobEffects.load();

		AuroriaModItems.load();

		AuroriaModProcedures.load();

	}
}
