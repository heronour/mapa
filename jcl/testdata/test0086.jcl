//OUTPUTP JOB
//*
//STEP0001 EXEC PGM=IEBGENER
//DD000001 DD  OUTPUT=*.DD
//DD000002 DD  OUTPUT=*.STEP.DD
//DD000003 DD  OUTPUT=*.STEP.PROCSTEP.DD
//DD000004 DD  OUTPUT=(*.DD)
//DD000005 DD  OUTPUT=(*.STEP.DD)
//DD000006 DD  OUTPUT=(*.STEP.PROCSTEP.DD)
//DD000007 DD  OUTPUT=(*.DD,*.STEP.DD)
//DD000008 DD  OUTPUT=(*.STEP.DD,*.STEP.PROCSTEP.DD)
//DD000009 DD  OUTPUT=(*.STEP.PROCSTEP.DD,*.DD)
//DD000010 DD  OUTPUT=(*.DD,
//             *.DD)
//DD000011 DD  OUTPUT=(*.DD,*.DD,
//             *.DD)
//DD000012 DD  OUTPUT=(*.DD,
//             *.DD,*.DD)
//DD000013 DD  OUTPUT=(*.DD,
//             *.DD,
//             *.DD)
//DD000014 DD  OUTPUT=(*.DD,
//             *.DD,
//             *.DD,
//             *.DD)
//DD000015 DD  OUTPUT=(*.STEP.DD,
//             *.STEP.DD)
//DD000016 DD  OUTPUT=(*.STEP.DD,*.STEP.DD,
//             *.STEP.DD)
//DD000017 DD  OUTPUT=(*.STEP.DD,
//             *.STEP.DD,*.STEP.DD)
//DD000018 DD  OUTPUT=(*.STEP.DD,
//             *.STEP.DD,
//             *.STEP.DD)
//DD000019 DD  OUTPUT=(*.STEP.DD,
//             *.STEP.DD,
//             *.STEP.DD,
//             *.STEP.DD)
//DD000020 DD  OUTPUT=(*.STEP.PROCSTEP.DD,
//             *.STEP.PROCSTEP.DD)
//DD000021 DD  OUTPUT=(*.STEP.PROCSTEP.DD,*.STEP.PROCSTEP.DD,
//             *.STEP.PROCSTEP.DD)
//DD000022 DD  OUTPUT=(*.STEP.PROCSTEP.DD,
//             *.STEP.PROCSTEP.DD,*.STEP.PROCSTEP.DD)
//DD000023 DD  OUTPUT=(*.STEP.PROCSTEP.DD,
//             *.STEP.PROCSTEP.DD,
//             *.STEP.PROCSTEP.DD)
//DD000024 DD  OUTPUT=(*.STEP.PROCSTEP.DD,
//             *.STEP.PROCSTEP.DD,
//             *.STEP.PROCSTEP.DD,
//             *.STEP.PROCSTEP.DD)
//DD000101 DD  OUTPUT=*.DD OUTPUT
//DD000102 DD  OUTPUT=*.STEP.DD OUTPUT
//DD000103 DD  OUTPUT=*.STEP.PROCSTEP.DD OUTPUT
//DD000104 DD  OUTPUT=(*.DD) OUTPUT
//DD000105 DD  OUTPUT=(*.STEP.DD) OUTPUT
//DD000106 DD  OUTPUT=(*.STEP.PROCSTEP.DD) OUTPUT
//DD000107 DD  OUTPUT=(*.DD,*.STEP.DD) OUTPUT
//DD000108 DD  OUTPUT=(*.STEP.DD,*.STEP.PROCSTEP.DD) OUTPUT
//DD000109 DD  OUTPUT=(*.STEP.PROCSTEP.DD,*.DD) OUTPUT
//DD000110 DD  OUTPUT=(*.DD, OUTPUT
//             *.DD) OUTPUT
//DD000111 DD  OUTPUT=(*.DD,*.DD, OUTPUT
//             *.DD) OUTPUT
//DD000112 DD  OUTPUT=(*.DD, OUTPUT
//             *.DD,*.DD) OUTPUT
//DD000113 DD  OUTPUT=(*.DD, OUTPUT
//             *.DD, OUTPUT
//             *.DD) OUTPUT
//DD000114 DD  OUTPUT=(*.DD, OUTPUT
//             *.DD, OUTPUT
//             *.DD, OUTPUT
//             *.DD) OUTPUT
//DD000115 DD  OUTPUT=(*.STEP.DD, OUTPUT
//             *.STEP.DD) OUTPUT
//DD000116 DD  OUTPUT=(*.STEP.DD,*.STEP.DD, OUTPUT
//             *.STEP.DD) OUTPUT
//DD000117 DD  OUTPUT=(*.STEP.DD, OUTPUT
//             *.STEP.DD,*.STEP.DD) OUTPUT
//DD000118 DD  OUTPUT=(*.STEP.DD, OUTPUT
//             *.STEP.DD, OUTPUT
//             *.STEP.DD) OUTPUT
//DD000119 DD  OUTPUT=(*.STEP.DD, OUTPUT
//             *.STEP.DD, OUTPUT
//             *.STEP.DD, OUTPUT
//             *.STEP.DD) OUTPUT
//DD000120 DD  OUTPUT=(*.STEP.PROCSTEP.DD, OUTPUT
//             *.STEP.PROCSTEP.DD) OUTPUT
//DD000121 DD  OUTPUT=(*.STEP.PROCSTEP.DD,*.STEP.PROCSTEP.DD, OUTPUT
//             *.STEP.PROCSTEP.DD) OUTPUT
//DD000122 DD  OUTPUT=(*.STEP.PROCSTEP.DD, OUTPUT
//             *.STEP.PROCSTEP.DD,*.STEP.PROCSTEP.DD) OUTPUT
//DD000123 DD  OUTPUT=(*.STEP.PROCSTEP.DD, OUTPUT
//             *.STEP.PROCSTEP.DD, OUTPUT
//             *.STEP.PROCSTEP.DD) OUTPUT
//DD000124 DD  OUTPUT=(*.STEP.PROCSTEP.DD, OUTPUT
//             *.STEP.PROCSTEP.DD, OUTPUT
//             *.STEP.PROCSTEP.DD, OUTPUT
//             *.STEP.PROCSTEP.DD) OUTPUT
