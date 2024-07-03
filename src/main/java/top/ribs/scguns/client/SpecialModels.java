package top.ribs.scguns.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import top.ribs.scguns.Reference;

/**
 * Author: MrCrayfish
 */
@Mod.EventBusSubscriber(modid = Reference.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public enum SpecialModels {
    MACERATOR_BASE("macerator/macerator"),
    MACERATOR_WHEEL_1("macerator/macerator_wheel_1"),
    MACERATOR_WHEEL_2("macerator/macerator_wheel_2"),
    MACERATOR_WHEEL_3("macerator/macerator_wheel_3"),
    MACERATOR_WHEEL_4("macerator/macerator_wheel_4"),


    MECHANICAL_PRESS_PRESS("mechanical_press/press"),



///FLINTLOCK
    FLINTLOCK_PISTOL("gun/flintlock_pistol"),
    FLINTLOCK_PISTOL_MAIN("flintlock_pistol/main"),
    FLINTLOCK_PISTOL_HAMMER("flintlock_pistol/hammer"),
    FLINTLOCK_PISTOL_STOCK_WEIGHTED("flintlock_pistol/heavy_stock"),
    FLINTLOCK_PISTOL_STOCK_LIGHT("flintlock_pistol/light_stock"),
    FLINTLOCK_PISTOL_STOCK_WOODEN("flintlock_pistol/wooden_stock"),
    HANDCANNON_MAIN("handcannon/main"),
///MUSKET
    MUSKET_MAIN("musket/main"),
    MUSKET_HAMMER("musket/hammer"),
    MUSKET_STOCK_WEIGHTED("musket/heavy_stock"),
    MUSKET_STOCK_LIGHT("musket/light_stock"),
    MUSKET_STOCK_WOODEN("musket/wooden_stock"),
    MUSKET_IRON_BAYONET("musket/iron_bayonet"),
    MUSKET_ANTHRALITE_BAYONET("musket/anthralite_bayonet"),
    MUSKET_DIAMOND_BAYONET("musket/diamond_bayonet"),
    MUSKET_NETHERITE_BAYONET("musket/netherite_bayonet"),
    MUSKET_LIGHT_GRIP("musket/light_grip"),
    MUSKET_VERTICAL_GRIP("musket/vert_grip"),
    MUSKET_FLASH("musket/flash"),
///BLUNDERBUSS
    BLUNDERBUSS_MAIN("blunderbuss/main"),
    BLUNDERBUSS_HAMMER("blunderbuss/hammer"),
    BLUNDERBUSS_IRON_BAYONET("blunderbuss/iron_bayonet"),
    BLUNDERBUSS_ANTHRALITE_BAYONET("blunderbuss/anthralite_bayonet"),
    BLUNDERBUSS_DIAMOND_BAYONET("blunderbuss/diamond_bayonet"),
    BLUNDERBUSS_NETHERITE_BAYONET("blunderbuss/netherite_bayonet"),
    BLUNDERBUSS_LIGHT_GRIP("blunderbuss/light_grip"),
    BLUNDERBUSS_VERTICAL_GRIP("blunderbuss/vert_grip"),
///REPEATINGMUSKET
    REPEATING_MUSKET_MAIN("repeating_musket/main"),
    REPEATING_MUSKET_HAMMER("repeating_musket/hammer"),
    REPEATING_MUSKET_MAGAZINE("repeating_musket/magazine"),
    REPEATING_MUSKET_IRON_BAYONET("repeating_musket/iron_bayonet"),
    REPEATING_MUSKET_ANTHRALITE_BAYONET("repeating_musket/anthralite_bayonet"),
    REPEATING_MUSKET_DIAMOND_BAYONET("repeating_musket/diamond_bayonet"),
    REPEATING_MUSKET_NETHERITE_BAYONET("repeating_musket/netherite_bayonet"),
    REPEATING_MUSKET_LIGHT_GRIP("repeating_musket/grip_light"),
    REPEATING_MUSKET_VERTICAL_GRIP("repeating_musket/grip_vert"),

    ///LASER_MUSKET
 LASER_MUSKET_MAIN("laser_musket/main"),

    ///COPPERMAGNUM
    BRUISER_MAIN("bruiser/main"),
    BRUISER_BARREL("bruiser/barrel"),
    BRUISER_SILENCER("bruiser/silencer"),
    BRUISER_ADVANCED_SILENCER("bruiser/advanced_silencer"),
    BRUISER_MUZZLE_BRAKE("bruiser/muzzle_brake"),
    ///SCRAP_SIDEARM
    SCRAP_SIDEARM("gun/scrap_sidearm"),
    SCRAP_SIDEARM_MAIN("scrap_sidearm/main"),
    SCRAP_SIDEARM_BOLT("scrap_sidearm/bolt"),
    SCRAP_SIDEARM_MAGAZINE("scrap_sidearm/magazine"),

    SCRAP_SIDEARM_SILENCER("scrap_sidearm/silencer"),
    SCRAP_SIDEARM_MUZZLE_BRAKE("scrap_sidearm/muzzle_brake"),
    SCRAP_SIDEARM_ADVANCED_SILENCER("scrap_sidearm/advanced_silencer"),
    SCRAP_SIDEARM_STOCK_LIGHT("scrap_sidearm/stock_light"),
    SCRAP_SIDEARM_STOCK_HEAVY("scrap_sidearm/stock_weighted"),
    SCRAP_SIDEARM_STOCK_WOODEN("scrap_sidearm/stock_wooden"),

    ///BOOMSTICK
    BOOMSTICK_MAIN("boomstick/main"),
    BOOMSTICK_BARREL("boomstick/barrel"),
    BOOMSTICK_STOCK_WEIGHTED("boomstick/stock_weighted"),
    BOOMSTICK_STOCK_LIGHT("boomstick/stock_light"),
    BOOMSTICK_STOCK_WOODEN("boomstick/stock_wooden"),
    BOOMSTICK_SILENCER("boomstick/silencer"),
    BOOMSTICK_ADVANCED_SILENCER("boomstick/advanced_silencer"),
    BOOMSTICK_MUZZLE_BRAKE("boomstick/muzzle_brake"),
    BOOMSTICK_GRIP_LIGHT("boomstick/grip_light"),
    BOOMSTICK_GRIP_VERTICAL("boomstick/grip_vertical"),
    BOOMSTICK_IRON_BAYONET("boomstick/iron_bayonet"),
    BOOMSTICK_ANTHRALITE_BAYONET("boomstick/anthralite_bayonet"),
    BOOMSTICK_DIAMOND_BAYONET("boomstick/diamond_bayonet"),
    BOOMSTICK_NETHERITE_BAYONET("boomstick/netherite_bayonet"),

    //RUSTY_GNAT
    RUSTY_GNAT_MAIN("rusty_gnat/main"),
    RUSTY_GNAT_BOLT("rusty_gnat/bolt"),
    RUSTY_GNAT_BARREL("rusty_gnat/barrel"),
    RUSTY_GNAT_STOCK_WEIGHTED("rusty_gnat/stock_weighted"),
    RUSTY_GNAT_STOCK_LIGHT("rusty_gnat/stock_light"),
    RUSTY_GNAT_STOCK_WOODEN("rusty_gnat/stock_wooden"),
    RUSTY_GNAT_SILENCER("rusty_gnat/silencer"),
    RUSTY_GNAT_ADVANCED_SILENCER("rusty_gnat/advanced_silencer"),
    RUSTY_GNAT_MUZZLE_BRAKE("rusty_gnat/muzzle_brake"),
    RUSTY_GNAT_STANDARD_MAG("rusty_gnat/stan_mag"),
    RUSTY_GNAT_EXTENDED_MAG("rusty_gnat/ext_mag"),
    RUSTY_GNAT_SPEED_MAG("rusty_gnat/speed_mag"),
/// MAKESHIFT_RIFLE
    MAKESHIFT_RIFLE_MAIN("makeshift_rifle/main"),
    MAKESHIFT_RIFLE_BOLT("makeshift_rifle/bolt"),
    MAKESHIFT_RIFLE_STOCK_LIGHT("makeshift_rifle/stock_light"),
    MAKESHIFT_RIFLE_STOCK_WEIGHTED("makeshift_rifle/stock_weighted"),
    MAKESHIFT_RIFLE_STOCK_WOODEN("makeshift_rifle/stock_wooden"),
    MAKESHIFT_RIFLE_SILENCER("makeshift_rifle/silencer"),
    MAKESHIFT_RIFLE_ADVANCED_SILENCER("makeshift_rifle/advanced_silencer"),
    MAKESHIFT_RIFLE_MUZZLE_BRAKE("makeshift_rifle/muzzle_brake"),
    MAKESHIFT_RIFLE_VERTICAL_GRIP("makeshift_rifle/vertical_grip"),
    MAKESHIFT_RIFLE_LIGHT_GRIP("makeshift_rifle/light_grip"),
    MAKESHIFT_RIFLE_IRON_BAYONET("makeshift_rifle/iron_bayonet"),
    MAKESHIFT_RIFLE_ANTHRALITE_BAYONET("makeshift_rifle/anthralite_bayonet"),
    MAKESHIFT_RIFLE_DIAMOND_BAYONET("makeshift_rifle/diamond_bayonet"),
    MAKESHIFT_RIFLE_NETHERITE_BAYONET("makeshift_rifle/netherite_bayonet"),
    MAKESHIFT_RIFLE_STANDARD_MAG("makeshift_rifle/stan_mag"),
    MAKESHIFT_RIFLE_EXTENDED_MAG("makeshift_rifle/ext_mag"),
    MAKESHIFT_RIFLE_SPEED_MAG("makeshift_rifle/speed_mag"),
////IRONCARABINE
    M3_CARABINE_MAIN("m3_carabine/main"),
    M3_CARABINE_SIGHTS("m3_carabine/sights"),
    M3_CARABINE_NO_SIGHTS("m3_carabine/no_sights"),
    M3_CARABINE_BOLT("m3_carabine/bolt"),
    M3_CARABINE_STOCK_LIGHT("m3_carabine/light_stock"),
    M3_CARABINE_STOCK_HEAVY("m3_carabine/heavy_stock"),
    M3_CARABINE_STOCK_WOODEN("m3_carabine/wooden_stock"),
    M3_CARABINE_SILENCER("m3_carabine/silencer"),
    M3_CARABINE_ADVANCED_SILENCER("m3_carabine/advanced_silencer"),
    M3_CARABINE_MUZZLE_BRAKE("m3_carabine/muzzle_brake"),
    M3_CARABINE_GRIP_LIGHT("m3_carabine/light_grip"),
    M3_CARABINE_GRIP_VERTICAL("m3_carabine/tact_grip"),
    M3_CARABINE_IRON_BAYONET("m3_carabine/iron_bayonet"),
    M3_CARABINE_ANTHRALITE_BAYONET("m3_carabine/anthralite_bayonet"),
    M3_CARABINE_DIAMOND_BAYONET("m3_carabine/diamond_bayonet"),
    M3_CARABINE_NETHERITE_BAYONET("m3_carabine/netherite_bayonet"),
    M3_CARABINE_STANDARD_MAG("m3_carabine/stan_mag"),
    M3_CARABINE_EXTENDED_MAG("m3_carabine/ext_mag"),
    M3_CARABINE_PLUS_P_MAG("m3_carabine/plus_mag"),
    M3_CARABINE_SPEED_MAG("m3_carabine/speed_mag"),

    GREASER_SMG_MAIN("greaser_smg/main"),
    GREASER_SMG_SIGHTS("greaser_smg/sights"),
    GREASER_SMG_NO_SIGHTS("greaser_smg/no_sights"),
    GREASER_SMG_BOLT("greaser_smg/bolt"),
    GREASER_SMG_STOCK_LIGHT("greaser_smg/light_stock"),
    GREASER_SMG_STOCK_HEAVY("greaser_smg/heavy_stock"),
    GREASER_SMG_STOCK_WOODEN("greaser_smg/wooden_stock"),
    GREASER_SMG_SILENCER("greaser_smg/silencer"),
    GREASER_SMG_ADVANCED_SILENCER("greaser_smg/advanced_silencer"),
    GREASER_SMG_MUZZLE_BRAKE("greaser_smg/muzzle_brake"),
    GREASER_SMG_STANDARD_MAG("greaser_smg/stan_mag"),
    GREASER_SMG_EXTENDED_MAG("greaser_smg/ext_mag"),
    GREASER_SMG_SPEED_MAG("greaser_smg/speed_mag"),
///DEFENDERPISTOL
    DEFENDER_PISTOL_MAIN("defender_pistol/main"),
    DEFENDER_PISTOL_RECEIVER("defender_pistol/receiver"),
    DEFENDER_PISTOL_SILENCER("defender_pistol/silencer"),
    DEFENDER_PISTOL_ADVANCED_SILENCER("defender_pistol/advanced_silencer"),
    DEFENDER_PISTOL_MUZZLE_BRAKE("defender_pistol/muzzle_brake"),
    DEFENDER_PISTOL_EXTENDED_MAG("defender_pistol/ext_mag"),
    DEFENDER_PISTOL_STANDARD_MAG("defender_pistol/stan_mag"),
    ///AUVTOMAG
    AUVTOMAG_MAIN("auvtomag/main"),
    AUVTOMAG_RECEIVER("auvtomag/receiver"),
    AUVTOMAG_SILENCER("auvtomag/silencer"),
    AUVTOMAG_ADVANCED_SILENCER("auvtomag/advanced_silencer"),
    AUVTOMAG_MUZZLE_BRAKE("auvtomag/muzzle_brake"),
    AUVTOMAG_EXTENDED_MAG("auvtomag/ext_mag"),
    AUVTOMAG_STANDARD_MAG("auvtomag/stan_mag"),
    AUVTOMAG_SIGHTS("auvtomag/sights"),
    AUVTOMAG_NO_SIGHTS("auvtomag/no_sights"),

    ///IRONSPEAR
    IRON_SPEAR_MAIN("iron_spear/main"),
    IRON_SPEAR_SIGHTS("iron_spear/sights"),
    IRON_SPEAR_NO_SIGHTS("iron_spear/no_sights"),
    IRON_SPEAR_BOLT("iron_spear/bolt"),
    IRON_SPEAR_STOCK_LIGHT("iron_spear/light_stock"),
    IRON_SPEAR_STOCK_HEAVY("iron_spear/heavy_stock"),
    IRON_SPEAR_STOCK_WOODEN("iron_spear/wooden_stock"),
    IRON_SPEAR_SILENCER("iron_spear/silencer"),
    IRON_SPEAR_ADVANCED_SILENCER("iron_spear/advanced_silencer"),
    IRON_SPEAR_MUZZLE_BRAKE("iron_spear/muzzle_brake"),
    IRON_SPEAR_TACT_GRIP("iron_spear/tact_grip"),
    IRON_SPEAR_LIGHT_GRIP("iron_spear/light_grip"),
    IRON_SPEAR_IRON_BAYONET("iron_spear/iron_bayonet"),
    IRON_SPEAR_ANTHRALITE_BAYONET("iron_spear/anthralite_bayonet"),
    IRON_SPEAR_DIAMOND_BAYONET("iron_spear/diamond_bayonet"),
    IRON_SPEAR_NETHERITE_BAYONET("iron_spear/netherite_bayonet"),
    IRON_SPEAR_STANDARD_MAG("iron_spear/stan_mag"),
    IRON_SPEAR_EXTENDED_MAG("iron_spear/ext_mag"),
    IRON_SPEAR_SPEED_MAG("iron_spear/speed_mag"),
///COMBATSHOTGUN
    COMBAT_SHOTGUN_MAIN("combat_shotgun/main"),
    COMBAT_SHOTGUN_SIGHTS("combat_shotgun/sights"),
    COMBAT_SHOTGUN_NO_SIGHTS("combat_shotgun/no_sights"),
    COMBAT_SHOTGUN_BOLT("combat_shotgun/bolt"),
    COMBAT_SHOTGUN_STOCK_LIGHT("combat_shotgun/light_stock"),
    COMBAT_SHOTGUN_STOCK_HEAVY("combat_shotgun/heavy_stock"),
    COMBAT_SHOTGUN_STOCK_WOODEN("combat_shotgun/wooden_stock"),
    COMBAT_SHOTGUN_SILENCER("combat_shotgun/silencer"),
    COMBAT_SHOTGUN_ADVANCED_SILENCER("combat_shotgun/advanced_silencer"),
    COMBAT_SHOTGUN_MUZZLE_BRAKE("combat_shotgun/muzzle_brake"),
    COMBAT_SHOTGUN_GRIP_LIGHT("combat_shotgun/light_grip"),
    COMBAT_SHOTGUN_GRIP_VERTICAL("combat_shotgun/tact_grip"),
    COMBAT_SHOTGUN_IRON_BAYONET("combat_shotgun/iron_bayonet"),
    COMBAT_SHOTGUN_ANTHRALITE_BAYONET("combat_shotgun/anthralite_bayonet"),
    COMBAT_SHOTGUN_DIAMOND_BAYONET("combat_shotgun/diamond_bayonet"),
    COMBAT_SHOTGUN_NETHERITE_BAYONET("combat_shotgun/netherite_bayonet"),
    COMBAT_SHOTGUN_STANDARD_MAG("combat_shotgun/stan_mag"),
    COMBAT_SHOTGUN_EXTENDED_MAG("combat_shotgun/ext_mag"),
    COMBAT_SHOTGUN_SPEED_MAG("combat_shotgun/speed_mag"),
    ///GYROJETPISTOL
    GYROJET_PISTOL_MAIN("gyrojet_pistol/main"),
    GYROJET_PISTOL_STOCK_HEAVY("gyrojet_pistol/heavy_stock"),
    GYROJET_PISTOL_STOCK_LIGHT("gyrojet_pistol/light_stock"),
    GYROJET_PISTOL_STOCK_WOODEN("gyrojet_pistol/wooden_stock"),
    GYROJET_PISTOL_FLAME_RIGHT("gyrojet_pistol/flame_right"),
    GYROJET_PISTOL_FLAME_LEFT("gyrojet_pistol/flame_left"),
    ///ROCKETRIFLE
    ROCKET_RIFLE_MAIN("rocket_rifle/main"),
    ROCKET_RIFLE_STOCK_HEAVY("rocket_rifle/heavy_stock"),
    ROCKET_RIFLE_STOCK_LIGHT("rocket_rifle/light_stock"),
    ROCKET_RIFLE_STOCK_WOODEN("rocket_rifle/wooden_stock"),
    ROCKET_RIFLE_GRIP_LIGHT("rocket_rifle/light_grip"),
    ROCKET_RIFLE_GRIP_VERTICAL("rocket_rifle/tact_grip"),
    ROCKET_RIFLE_IRON_BAYONET("rocket_rifle/iron_bayonet"),
    ROCKET_RIFLE_ANTHRALITE_BAYONET("rocket_rifle/anthralite_bayonet"),
    ROCKET_RIFLE_DIAMOND_BAYONET("rocket_rifle/diamond_bayonet"),
    ROCKET_RIFLE_NETHERITE_BAYONET("rocket_rifle/netherite_bayonet"),
    ///M22_WALTZ
    M22_WALTZ_MAIN("m22_waltz/main"),
    M22_WALTZ_RECEIVER("m22_waltz/receiver"),
    M22_WALTZ_SILENCER("m22_waltz/silencer"),
    M22_WALTZ_ADVANCED_SILENCER("m22_waltz/advanced_silencer"),
    M22_WALTZ_MUZZLE_BRAKE("m22_waltz/muzzle_brake"),
    M22_WALTZ_EXTENDED_MAG("m22_waltz/ext_mag"),
    M22_WALTZ_STANDARD_MAG("m22_waltz/stan_mag"),
    M22_WALTZ_SIGHTS("m22_waltz/sights"),
    M22_WALTZ_NO_SIGHTS("m22_waltz/no_sights"),
    ///SPITFIRE
    SPITFIRE_MAIN("spitfire/main"),
    ///SUPER_SHOTGUN
    SUPER_SHOTGUN_MAIN("super_shotgun/main"),
    ///CYCLONE
    CYCLONE_MAIN("cyclone/main"),
    CYCLONE_BARREL("cyclone/barrel"),
    ///GATTALER
    GATTALER_MAIN("gattaler/main"),
    GATTALER_BARREL("gattaler/barrels"),
    ///PRUSH
    PRUSH_GUN_MAIN("prush_gun/main"),
    PRUSH_GUN_SIGHTS("prush_gun/sights"),
    PRUSH_GUN_NO_SIGHTS("prush_gun/no_sights"),
    PRUSH_GUN_BOLT("prush_gun/bolt"),
    PRUSH_GUN_STOCK_LIGHT("prush_gun/light_stock"),
    PRUSH_GUN_STOCK_HEAVY("prush_gun/heavy_stock"),
    PRUSH_GUN_STOCK_WOODEN("prush_gun/wooden_stock"),
    PRUSH_GUN_SILENCER("prush_gun/silencer"),
    PRUSH_GUN_ADVANCED_SILENCER("prush_gun/advanced_silencer"),
    PRUSH_GUN_MUZZLE_BRAKE("prush_gun/muzzle_brake"),
    PRUSH_GUN_GRIP_LIGHT("prush_gun/light_grip"),
    PRUSH_GUN_GRIP_VERTICAL("prush_gun/tact_grip"),
    PRUSH_GUN_IRON_BAYONET("prush_gun/iron_bayonet"),
    PRUSH_GUN_ANTHRALITE_BAYONET("prush_gun/anthralite_bayonet"),
    PRUSH_GUN_DIAMOND_BAYONET("prush_gun/diamond_bayonet"),
    PRUSH_GUN_NETHERITE_BAYONET("prush_gun/netherite_bayonet"),
    PRUSH_GUN_STANDARD_MAG("prush_gun/stan_mag"),
    PRUSH_GUN_EXTENDED_MAG("prush_gun/ext_mag"),
    PRUSH_GUN_SPEED_MAG("prush_gun/speed_mag"),
    ///KRAUSER
    KRAUSER_MAIN("krauser/main"),
    KRAUSER_RECEIVER("krauser/receiver"),
    KRAUSER_SILENCER("krauser/silencer"),
    KRAUSER_ADVANCED_SILENCER("krauser/advanced_silencer"),
    KRAUSER_MUZZLE_BRAKE("krauser/muzzle_brake"),
    KRAUSER_EXTENDED_MAG("krauser/ext_mag"),
    KRAUSER_STANDARD_MAG("krauser/stan_mag"),
    KRAUSER_STOCK_LIGHT("krauser/light_stock"),
    KRAUSER_STOCK_HEAVY("krauser/heavy_stock"),
    KRAUSER_STOCK_WOODEN("krauser/wooden_stock"),

    ///INERTIAL
    INERTIAL_MAIN("inertial/main"),
    INERTIAL_SIGHTS("inertial/sights"),
    INERTIAL_NO_SIGHTS("inertial/no_sights"),
    INERTIAL_BOLT("inertial/bolt"),
    INERTIAL_SILENCER("inertial/silencer"),
    INERTIAL_ADVANCED_SILENCER("inertial/advanced_silencer"),
    INERTIAL_MUZZLE_BRAKE("inertial/muzzle_brake"),
    INERTIAL_GRIP_LIGHT("inertial/light_grip"),
    INERTIAL_GRIP_VERTICAL("inertial/tact_grip"),
    INERTIAL_IRON_BAYONET("inertial/iron_bayonet"),
    INERTIAL_ANTHRALITE_BAYONET("inertial/anthralite_bayonet"),
    INERTIAL_DIAMOND_BAYONET("inertial/diamond_bayonet"),
    INERTIAL_NETHERITE_BAYONET("inertial/netherite_bayonet"),
    INERTIAL_STANDARD_MAG("inertial/stan_mag"),
    INERTIAL_EXTENDED_MAG("inertial/ext_mag"),
    INERTIAL_SPEED_MAG("inertial/speed_mag"),
    ///UPPERCUT
    UPPERCUT_MAIN("uppercut/main"),
    UPPERCUT_RECEIVER("uppercut/receiver"),
    UPPERCUT_SILENCER("uppercut/silencer"),
    UPPERCUT_ADVANCED_SILENCER("uppercut/advanced_silencer"),
    UPPERCUT_MUZZLE_BRAKE("uppercut/muzzle_brake"),
    UPPERCUT_WOODEN_STOCK("uppercut/wooden_stock"),
    UPPERCUT_HEAVY_STOCK("uppercut/heavy_stock"),
    UPPERCUT_LIGHT_STOCK("uppercut/light_stock"),
    UPPERCUT_STANDARD_GRIP("uppercut/stan_grip"),
    UPPERCUT_SIGHTS("uppercut/sights"),
    UPPERCUT_NO_SIGHTS("uppercut/no_sights"),
    ///PLASGUN
    PLASGUN_MAIN("plasgun/main"),
    PLASGUN_SIGHTS("plasgun/sights"),
    PLASGUN_NO_SIGHTS("plasgun/no_sights"),
    PLASGUN_STOCK_LIGHT("plasgun/light_stock"),
    PLASGUN_STOCK_HEAVY("plasgun/heavy_stock"),
    PLASGUN_STOCK_WOODEN("plasgun/wooden_stock"),
    PLASGUN_GRIP_LIGHT("plasgun/light_grip"),
    PLASGUN_GRIP_VERTICAL("plasgun/tact_grip"),
    PLASGUN_IRON_BAYONET("plasgun/iron_bayonet"),
    PLASGUN_ANTHRALITE_BAYONET("plasgun/anthralite_bayonet"),
    PLASGUN_DIAMOND_BAYONET("plasgun/diamond_bayonet"),
    PLASGUN_NETHERITE_BAYONET("plasgun/netherite_bayonet"),
    PLASGUN_STANDARD_MAG("plasgun/stan_mag"),
    PLASGUN_EXTENDED_MAG("plasgun/ext_mag"),
    PLASGUN_SPEED_MAG("plasgun/speed_mag"),
    ///GAUSS_RIFLE
    GAUSS_RIFLE_MAIN("gauss_rifle/main"),
    GAUSS_RIFLE_SIGHTS("gauss_rifle/sights"),
    GAUSS_RIFLE_NO_SIGHTS("gauss_rifle/no_sights"),
    GAUSS_RIFLE_STOCK_LIGHT("gauss_rifle/light_stock"),
    GAUSS_RIFLE_STOCK_HEAVY("gauss_rifle/heavy_stock"),
    GAUSS_RIFLE_STOCK_WOODEN("gauss_rifle/wooden_stock"),
    GAUSS_RIFLE_GRIP_LIGHT("gauss_rifle/light_grip"),
    GAUSS_RIFLE_GRIP_VERTICAL("gauss_rifle/tact_grip"),
    GAUSS_RIFLE_IRON_BAYONET("gauss_rifle/iron_bayonet"),
    GAUSS_RIFLE_ANTHRALITE_BAYONET("gauss_rifle/anthralite_bayonet"),
    GAUSS_RIFLE_DIAMOND_BAYONET("gauss_rifle/diamond_bayonet"),
    GAUSS_RIFLE_NETHERITE_BAYONET("gauss_rifle/netherite_bayonet"),
    GAUSS_RIFLE_STANDARD_MAG("gauss_rifle/stan_mag"),
    GAUSS_RIFLE_EXTENDED_MAG("gauss_rifle/ext_mag"),
    GAUSS_RIFLE_SPEED_MAG("gauss_rifle/speed_mag"),
//COGLOADER
COGLOADER_MAIN("cogloader/main"),
    COGLOADER_SIGHTS("cogloader/sights"),
    COGLOADER_NO_SIGHTS("cogloader/no_sights"),
    COGLOADER_BOLT("cogloader/bolt"),
    COGLOADER_MAGAZINE("cogloader/magazine"),
    COGLOADER_STOCK_LIGHT("cogloader/light_stock"),
    COGLOADER_STOCK_HEAVY("cogloader/heavy_stock"),
    COGLOADER_STOCK_WOODEN("cogloader/wooden_stock"),
    COGLOADER_SILENCER("cogloader/silencer"),
    COGLOADER_ADVANCED_SILENCER("cogloader/advanced_silencer"),
    COGLOADER_MUZZLE_BRAKE("cogloader/muzzle_brake"),
    COGLOADER_GRIP_LIGHT("cogloader/light_grip"),
    COGLOADER_GRIP_VERTICAL("cogloader/tact_grip"),
    COGLOADER_IRON_BAYONET("cogloader/iron_bayonet"),
    COGLOADER_ANTHRALITE_BAYONET("cogloader/anthralite_bayonet"),
    COGLOADER_DIAMOND_BAYONET("cogloader/diamond_bayonet"),
    COGLOADER_NETHERITE_BAYONET("cogloader/netherite_bayonet"),
    ///OSGOOD
    OSGOOD_50_MAIN("osgood_50/main"),
    OSGOOD_50_DRUM("osgood_50/drum"),
    OSGOOD_50_SILENCER("osgood_50/silencer"),
    OSGOOD_50_MUZZLE_BRAKE("osgood_50/muzzle_brake"),
    OSGOOD_50_ADVANCED_SILENCER("osgood_50/advanced_silencer"),
    OSGOOD_50_STOCK_LIGHT("osgood_50/stock_light"),
    OSGOOD_50_STOCK_HEAVY("osgood_50/stock_weighted"),
    OSGOOD_50_STOCK_WOODEN("osgood_50/stock_wooden"),
    ///DOZIER
    DOZIER_RL("gun/dozier_rl"),
    DOZIER_RL_MAIN("dozier_rl/main"),
    DOZIER_RL_DRUM("dozier_rl/drum"),
    DOZIER_RL_SIGHTS("dozier_rl/sights"),
    DOZIER_RL_NO_SIGHTS("dozier_rl/no_sights"),
    DOZIER_RL_GRIP_LIGHT("dozier_rl/light_grip"),
    DOZIER_RL_GRIP_VERTICAL("dozier_rl/tact_grip"),
    DOZIER_RL_IRON_BAYONET("dozier_rl/iron_bayonet"),
    DOZIER_RL_ANTHRALITE_BAYONET("dozier_rl/anthralite_bayonet"),
    DOZIER_RL_DIAMOND_BAYONET("dozier_rl/diamond_bayonet"),
    DOZIER_RL_NETHERITE_BAYONET("dozier_rl/netherite_bayonet"),

    ///JACKHAMMER
    JACKHAMMER_MAIN("jackhammer/main"),
    JACKHAMMER_BOLT("jackhammer/bolt"),
    JACKHAMMER_STOCK_LIGHT("jackhammer/light_stock"),
    JACKHAMMER_STOCK_HEAVY("jackhammer/heavy_stock"),
    JACKHAMMER_STOCK_WOODEN("jackhammer/wooden_stock"),
    JACKHAMMER_STANDARD_GRIP("jackhammer/stan_grip"),
    JACKHAMMER_SILENCER("jackhammer/silencer"),
    JACKHAMMER_ADVANCED_SILENCER("jackhammer/advanced_silencer"),
    JACKHAMMER_MUZZLE_BRAKE("jackhammer/muzzle_brake"),
    JACKHAMMER_GRIP_LIGHT("jackhammer/light_grip"),
    JACKHAMMER_GRIP_VERTICAL("jackhammer/tact_grip"),
    JACKHAMMER_IRON_BAYONET("jackhammer/iron_bayonet"),
    JACKHAMMER_ANTHRALITE_BAYONET("jackhammer/anthralite_bayonet"),
    JACKHAMMER_DIAMOND_BAYONET("jackhammer/diamond_bayonet"),
    JACKHAMMER_NETHERITE_BAYONET("jackhammer/netherite_bayonet"),
    JACKHAMMER_STANDARD_MAG("jackhammer/stan_mag"),
    JACKHAMMER_EXTENDED_MAG("jackhammer/ext_mag"),
    JACKHAMMER_SPEED_MAG("jackhammer/speed_mag"),
    ///MAS_55
    MAS_55_MAIN("mas_55/main"),
    MAS_55_BOLT("mas_55/bolt"),
    MAS_55_STOCK_LIGHT("mas_55/light_stock"),
    MAS_55_STOCK_HEAVY("mas_55/heavy_stock"),
    MAS_55_STOCK_WOODEN("mas_55/wooden_stock"),
    MAS_55_STANDARD_GRIP("mas_55/stan_grip"),
    MAS_55_SILENCER("mas_55/silencer"),
    MAS_55_ADVANCED_SILENCER("mas_55/advanced_silencer"),
    MAS_55_MUZZLE_BRAKE("mas_55/muzzle_brake"),
    MAS_55_GRIP_LIGHT("mas_55/light_grip"),
    MAS_55_GRIP_VERTICAL("mas_55/tact_grip"),
    MAS_55_IRON_BAYONET("mas_55/iron_bayonet"),
    MAS_55_ANTHRALITE_BAYONET("mas_55/anthralite_bayonet"),
    MAS_55_DIAMOND_BAYONET("mas_55/diamond_bayonet"),
    MAS_55_NETHERITE_BAYONET("mas_55/netherite_bayonet"),
    MAS_55_STANDARD_MAG("mas_55/stan_mag"),
    MAS_55_EXTENDED_MAG("mas_55/ext_mag"),
    MAS_55_SPEED_MAG("mas_55/speed_mag"),
    ///HOWLER
    HOWLER_MAIN("howler/main"),
    HOWLER_BOLT("howler/bolt"),
    HOWLER_STOCK_LIGHT("howler/light_stock"),
    HOWLER_STOCK_HEAVY("howler/heavy_stock"),
    HOWLER_STOCK_WOODEN("howler/wooden_stock"),
    HOWLER_STANDARD_GRIP("howler/stan_grip"),
    HOWLER_SILENCER("howler/silencer"),
    HOWLER_ADVANCED_SILENCER("howler/advanced_silencer"),
    HOWLER_MUZZLE_BRAKE("howler/muzzle_brake"),
    HOWLER_GRIP_LIGHT("howler/light_grip"),
    HOWLER_GRIP_VERTICAL("howler/tact_grip"),
    HOWLER_IRON_BAYONET("howler/iron_bayonet"),
    HOWLER_ANTHRALITE_BAYONET("howler/anthralite_bayonet"),
    HOWLER_DIAMOND_BAYONET("howler/diamond_bayonet"),
    HOWLER_NETHERITE_BAYONET("howler/netherite_bayonet"),
    HOWLER_STANDARD_MAG("howler/stan_mag"),
    HOWLER_EXTENDED_MAG("howler/ext_mag"),
    HOWLER_SPEED_MAG("howler/speed_mag"),
    HOWLER_SIGHTS("howler/sights"),
    HOWLER_NO_SIGHTS("howler/no_sights"),
    ///HOWLER
    HOWLER_CONVERSION_MAIN("howler_conversion/main"),
    HOWLER_CONVERSION_BOLT("howler_conversion/bolt"),
    HOWLER_CONVERSION_SIGHTS("howler_conversion/sights"),

    ///BLASPHEMY
    BLASPHEMY_MAIN("blasphemy/main"),
    BLASPHEMY_HEAD("blasphemy/head"),
    ///PYROCLASTIC_FLOW
    PYROCLASTIC_FLOW_MAIN("pyroclastic_flow/main"),
    PYROCLASTIC_FLOW_WOODEN_STOCK("pyroclastic_flow/wooden_stock"),
    PYROCLASTIC_FLOW_HEAVY_STOCK("pyroclastic_flow/heavy_stock"),
    PYROCLASTIC_FLOW_LIGHT_STOCK("pyroclastic_flow/light_stock"),
    ///FREYR
    FREYR_MAIN("freyr/main"),
    FREYR_STOCK_LIGHT("freyr/light_stock"),
    FREYR_STOCK_HEAVY("freyr/heavy_stock"),
    FREYR_STOCK_WOODEN("freyr/wooden_stock"),
    FREYR_STANDARD_GRIP("freyr/stan_grip"),
    FREYR_GRIP_LIGHT("freyr/light_grip"),
    FREYR_GRIP_VERTICAL("freyr/tact_grip"),
    FREYR_IRON_BAYONET("freyr/iron_bayonet"),
    FREYR_ANTHRALITE_BAYONET("freyr/anthralite_bayonet"),
    FREYR_DIAMOND_BAYONET("freyr/diamond_bayonet"),
    FREYR_NETHERITE_BAYONET("freyr/netherite_bayonet"),
    FREYR_STANDARD_MAG("freyr/stan_mag"),
    FREYR_EXTENDED_MAG("freyr/ext_mag"),
    FREYR_SPEED_MAG("freyr/speed_mag"),

    ///RAYGUN
    RAYGUN_MAIN("raygun/main"),
    RAYGUN_STOCK_HEAVY("raygun/heavy_stock"),
    RAYGUN_STOCK_LIGHT("raygun/light_stock"),
    RAYGUN_STOCK_WOODEN("raygun/wooden_stock"),


    FLAME("flame");

    /**
     * The location of an item model in the [MOD_ID]/models/special/[NAME] folder
     */
    private final ResourceLocation modelLocation;

    /**
     * Cached model
     */
    private BakedModel cachedModel;

    /**
     * Sets the model's location
     *
     * @param modelName name of the model file
     */
    SpecialModels(String modelName)
    {
        this.modelLocation = new ResourceLocation(Reference.MOD_ID, "special/" + modelName);
    }

    /**
     * Gets the model
     *
     * @return isolated model
     */
    public BakedModel getModel()
    {
        if(this.cachedModel == null)
        {
            this.cachedModel = Minecraft.getInstance().getModelManager().getModel(this.modelLocation);
        }
        return this.cachedModel;
    }

    /**
     * Registers the special models into the Forge Model Bakery. This is only called once on the
     * load of the game.
     */
    @SubscribeEvent
    public static void registerAdditional(ModelEvent.RegisterAdditional event)
    {
        for(SpecialModels model : values())
        {
            event.register(model.modelLocation);
        }
    }

    /**
     * Clears the cached BakedModel since it's been rebuilt. This is needed since the models may
     * have changed when a resource pack was applied, or if resources are reloaded.
     */
    @SubscribeEvent
    public static void onBake(ModelEvent.BakingCompleted event)
    {
        for(SpecialModels model : values())
        {
            model.cachedModel = null;
        }
    }
}