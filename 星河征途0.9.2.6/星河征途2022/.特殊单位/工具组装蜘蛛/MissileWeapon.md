[turret_missile]
shoot_sound:missile_fire
shoot_sound_vol:0.3
shoot_flame:small
shoot_light:#FFEECCCC
projectile:missile

[projectile_missile]
directDamage: 70
life: 300
speed: 15
trailEffect: true
largeHitEffect: true
ballistic: true
ballistic_delaymove_height:0
ballistic_height: 35
frame: 4
autoTargetingOnDeadTarget: true
deflectionPower: 3
lightColor: #ff0000
lightSize: 0.1
shieldDefectionMultiplier:0.5
mutator0_ifUnitWithTags:ArmourT1
mutator0_directDamageMultiplier:0.9
mutator0_areaDamageMultiplier:0.9
mutator1_ifUnitWithTags:ArmourT2
mutator1_directDamageMultiplier:0.8
mutator1_areaDamageMultiplier:0.8
mutator2_ifUnitWithTags:ArmourT3
mutator2_directDamageMultiplier:0.6

mutator2_areaDamageMultiplier:0.6

[projectile_missile_targetGround]
targetGround:true
targetGroundSpread:50
areaDamage:60
areaRadius:60
life: 300
speed: 3
trailEffect: true
largeHitEffect: true
ballistic: true
ballistic_delaymove_height:6
ballistic_height: 12
frame: 4
deflectionPower: 3
lightColor: #ff0000
lightSize: 0.1
shieldDefectionMultiplier:0.5
mutator0_ifUnitWithTags:ArmourT1
mutator0_directDamageMultiplier:0.9
mutator0_areaDamageMultiplier:0.9
mutator1_ifUnitWithTags:ArmourT2
mutator1_directDamageMultiplier:0.8
mutator1_areaDamageMultiplier:0.8
mutator2_ifUnitWithTags:ArmourT3
mutator2_directDamageMultiplier:0.6

mutator2_areaDamageMultiplier:0.6
areaHitAirAndLandAtSameTime:true

[projectile_aim_laser]
directDamage: 5
instant:true
laserEffect: true
life: 12
instantReuseLast:true
explodeEffect:NONE
explodeEffectOnShield:NONE
shieldDefectionMultiplier:0.5
mutator0_ifUnitWithTags:MR-BA
mutator0_directDamageMultiplier:0.9

[core]
tags:Medium
price: 1
maxHp:1
showOnMinimap:false
canNotBeDirectlyAttacked:true
canNotBeDamaged:true
radius:0
hideScorchMark:true
softCollisionOnAll: 0
numBitsOnDeath:0
explodeOnDeath:false
isUnrepairableUnit:true
disableAllUnitCollisions:true
fogOfWarSightRange:	0
isUnselectable:true
showInEditor:false

[graphics]
image:SHARED:blank.png
image_wreak:NONE
image_turret:NONE
image_shadow:NONE
icon_zoomed_out:SHARED:blank.png
showTransportBar:false
rotate_with_direction:false

[attack]
canAttack: false
canAttackFlyingUnits:false
canAttackLandUnits:false
canAttackUnderwaterUnits:false

[movement]
movementType:NONE
moveSpeed:0
maxTurnSpeed:0
moveIgnoringBody:true