package gtPlusPlus.xmod.gregtech.registration.gregtech;

import gtPlusPlus.api.objects.Logger;
import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.GregtechMetaTileEntity_IndustrialVacuumFreezer;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.advanced.*;

public class GregtechFactoryGradeReplacementMultis {

    public static void run() {
        run1();
    }

    private static void run1() {
        Logger.INFO("Gregtech 5 Content | Registering Advanced GT Multiblock replacements.");
        GregtechItemList.Machine_Adv_BlastFurnace.set(
                new GregtechMetaTileEntity_Adv_EBF(963, "multimachine.adv.blastfurnace", "Volcanus").getStackForm(1L));
        GregtechItemList.Machine_Adv_ImplosionCompressor.set(
                new GregtechMetaTileEntity_Adv_Implosion(964, "multimachine.adv.implosioncompressor", "Density^2")
                        .getStackForm(1L));
        GregtechItemList.Industrial_Cryogenic_Freezer.set(
                new GregtechMetaTileEntity_IndustrialVacuumFreezer(
                        910,
                        "multimachine.adv.industrialfreezer",
                        "Cryogenic Freezer").getStackForm(1L));
        GregtechItemList.FusionComputer_UV2.set(
                new GregtechMetaTileEntity_Adv_Fusion_MK4(965, "fusioncomputer.tier.09", "FusionTech MK IV")
                        .getStackForm(1L));
        GregtechItemList.FusionComputer_UV3.set(
                new GregtechMetaTileEntity_Adv_Fusion_MK5(975, "fusioncomputer.tier.10", "FusionTech MK V")
                        .getStackForm(1L));

        // 31021
        GregtechItemList.Machine_Adv_DistillationTower.set(
                new GregtechMetaTileEntity_Adv_DistillationTower(
                        31021,
                        "multimachine.adv.distillationtower",
                        "Dangote Distillus").getStackForm(1L));
    }
}
