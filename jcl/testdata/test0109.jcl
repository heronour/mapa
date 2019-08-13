//SYMLIST JOB
//*
//STEP0001 EXEC PGM=IEFBR14
//DD000001 DD  SYMLIST=*
//DD000002 DD  SYMLIST=A
//DD000003 DD  SYMLIST=@
//DD000004 DD  SYMLIST=A1
//DD000005 DD  SYMLIST=#B
//DD000006 DD  SYMLIST=$C3
//DD000007 DD  SYMLIST=A1@B2#C$
//DD000008 DD  SYMLIST=@X4#5Y$Z
//DD000011 DD  SYMLIST=(*)
//DD000012 DD  SYMLIST=(A)
//DD000013 DD  SYMLIST=(@)
//DD000014 DD  SYMLIST=(A1)
//DD000015 DD  SYMLIST=(#B)
//DD000016 DD  SYMLIST=($C3)
//DD000017 DD  SYMLIST=(A1@B2#C$)
//DD000018 DD  SYMLIST=(@X4#5Y$Z)
//DD000020 DD  SYMLIST=(A1@B2#C$,@X4#5Y$Z)
//DD000021 DD  SYMLIST=(A1@B2#C$,@X4#5Y$Z,ABCDEFGH)
//DD000022 DD  SYMLIST=(A1@B2#C$,@X4#5Y$Z,ABCDEFGH,@1234567)
//DD000023 DD  SYMLIST=(A1@B2#C$,
//             @X4#5Y$Z,
//             ABCDEFGH,
//             @1234567)
//DD000101 DD  SYMLIST=* SYMLIST
//DD000102 DD  SYMLIST=A SYMLIST
//DD000103 DD  SYMLIST=@ SYMLIST
//DD000104 DD  SYMLIST=A1 SYMLIST
//DD000105 DD  SYMLIST=#B SYMLIST
//DD000106 DD  SYMLIST=$C3 SYMLIST
//DD000107 DD  SYMLIST=A1@B2#C$ SYMLIST
//DD000108 DD  SYMLIST=@X4#5Y$Z SYMLIST
//DD000111 DD  SYMLIST=(*) SYMLIST
//DD000112 DD  SYMLIST=(A) SYMLIST
//DD000113 DD  SYMLIST=(@) SYMLIST
//DD000114 DD  SYMLIST=(A1) SYMLIST
//DD000115 DD  SYMLIST=(#B) SYMLIST
//DD000116 DD  SYMLIST=($C3) SYMLIST
//DD000117 DD  SYMLIST=(A1@B2#C$) SYMLIST
//DD000118 DD  SYMLIST=(@X4#5Y$Z) SYMLIST
//DD000120 DD  SYMLIST=(A1@B2#C$,@X4#5Y$Z) SYMLIST
//DD000121 DD  SYMLIST=(A1@B2#C$,@X4#5Y$Z,ABCDEFGH) SYMLIST
//DD000122 DD  SYMLIST=(A1@B2#C$,@X4#5Y$Z,ABCDEFGH,@1234567) SYMLIST
//DD000123 DD  SYMLIST=(A1@B2#C$, SYMLIST
//             @X4#5Y$Z, SYMLIST
//             ABCDEFGH, SYMLIST
//             @1234567) SYMLIST
//DD001001 DD  *,SYMLIST=*
//DD001002 DD  *,SYMLIST=A
//DD001003 DD  *,SYMLIST=@
//DD001004 DD  *,SYMLIST=A1
//DD001005 DD  *,SYMLIST=#B
//DD001006 DD  *,SYMLIST=$C3
//DD001007 DD  *,SYMLIST=A1@B2#C$
//DD001008 DD  *,SYMLIST=@X4#5Y$Z
//DD001011 DD  *,SYMLIST=(*)
//DD001012 DD  *,SYMLIST=(A)
//DD001013 DD  *,SYMLIST=(@)
//DD001014 DD  *,SYMLIST=(A1)
//DD001015 DD  *,SYMLIST=(#B)
//DD001016 DD  *,SYMLIST=($C3)
//DD001017 DD  *,SYMLIST=(A1@B2#C$)
//DD001018 DD  *,SYMLIST=(@X4#5Y$Z)
//DD001020 DD  *,SYMLIST=(A1@B2#C$,@X4#5Y$Z)
//DD001021 DD  *,SYMLIST=(A1@B2#C$,@X4#5Y$Z,ABCDEFGH)
//DD001022 DD  *,SYMLIST=(A1@B2#C$,@X4#5Y$Z,ABCDEFGH,@1234567)
//DD001023 DD  *,SYMLIST=(A1@B2#C$,
//             @X4#5Y$Z,
//             ABCDEFGH,
//             @1234567)
//DD001101 DD  *,SYMLIST=* SYMLIST
//DD001102 DD  *,SYMLIST=A SYMLIST
//DD001103 DD  *,SYMLIST=@ SYMLIST
//DD001104 DD  *,SYMLIST=A1 SYMLIST
//DD001105 DD  *,SYMLIST=#B SYMLIST
//DD001106 DD  *,SYMLIST=$C3 SYMLIST
//DD001107 DD  *,SYMLIST=A1@B2#C$ SYMLIST
//DD001108 DD  *,SYMLIST=@X4#5Y$Z SYMLIST
//DD001111 DD  *,SYMLIST=(*) SYMLIST
//DD001112 DD  *,SYMLIST=(A) SYMLIST
//DD001113 DD  *,SYMLIST=(@) SYMLIST
//DD001114 DD  *,SYMLIST=(A1) SYMLIST
//DD001115 DD  *,SYMLIST=(#B) SYMLIST
//DD001116 DD  *,SYMLIST=($C3) SYMLIST
//DD001117 DD  *,SYMLIST=(A1@B2#C$) SYMLIST
//DD001118 DD  *,SYMLIST=(@X4#5Y$Z) SYMLIST
//DD001120 DD  *,SYMLIST=(A1@B2#C$,@X4#5Y$Z) SYMLIST
//DD001121 DD  *,SYMLIST=(A1@B2#C$,@X4#5Y$Z,ABCDEFGH) SYMLIST
//DD001122 DD  *,SYMLIST=(A1@B2#C$,@X4#5Y$Z,ABCDEFGH,@1234567) SYMLIST
//DD001123 DD  *,SYMLIST=(A1@B2#C$, SYMLIST
//             @X4#5Y$Z, SYMLIST
//             ABCDEFGH, SYMLIST
//             @1234567) SYMLIST

