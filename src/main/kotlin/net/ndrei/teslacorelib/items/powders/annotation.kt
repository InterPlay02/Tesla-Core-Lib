package net.ndrei.teslacorelib.items.powders

import net.ndrei.teslacorelib.PowderRegistry
import net.ndrei.teslacorelib.annotations.AnnotationPreInitHandler
import net.ndrei.teslacorelib.annotations.BaseAnnotationHandler

/**
 * Created by CF on 2017-06-29.
 */
@Target(AnnotationTarget.CLASS)
annotation class AutoRegisterPowder

@AnnotationPreInitHandler
@Suppress("unused")
object AutoRegisterGearHandler : BaseAnnotationHandler<ColoredPowderItem>({ it, _ ->
    PowderRegistry.addMaterial(it.materialName, it)
}, AutoRegisterPowder::class)