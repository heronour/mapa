//SYMBOLS JOB
//*
//STEP0001 EXEC PGM=IEFBR14
//DD000001 DD  *,SYMBOLS=CNVTSYS,LRECL=80
//DD000002 DD  *,SYMBOLS=EXECSYS,LRECL=80
//DD000003 DD  *,SYMBOLS=JCLONLY,LRECL=80
//DD000004 DD  *,SYMBOLS=(CNVTSYS),LRECL=80
//DD000005 DD  *,SYMBOLS=(EXECSYS),LRECL=80
//DD000006 DD  *,SYMBOLS=(JCLONLY),LRECL=80
//DD000007 DD  *,SYMBOLS=(CNVTSYS,LOGDD),LRECL=80
//DD000008 DD  *,SYMBOLS=(EXECSYS,LOGDD),LRECL=80
//DD000009 DD  *,SYMBOLS=(JCLONLY,LOGDD),LRECL=80
//DD000010 DD  *,SYMBOLS=(CNVTSYS,CNVTSYS),LRECL=80
//DD000011 DD  *,SYMBOLS=(EXECSYS,EXECSYS),LRECL=80
//DD000012 DD  *,SYMBOLS=(JCLONLY,JCLONLY),LRECL=80
//DD000013 DD  *,SYMBOLS=(CNVTSYS,&SYMBOLS),LRECL=80
//DD000014 DD  *,SYMBOLS=(EXECSYS,&SYMBOLS),LRECL=80
//DD000015 DD  *,SYMBOLS=(JCLONLY,&SYMBOLS),LRECL=80
//DD000016 DD  *,SYMBOLS=(&CNVTSYS),LRECL=80
//DD000017 DD  *,SYMBOLS=(&EXECSYS),LRECL=80
//DD000018 DD  *,SYMBOLS=(&JCLONLY),LRECL=80
//DD000019 DD  *,SYMBOLS=(&CNVTSYS,CNVTSYS),LRECL=80
//DD000020 DD  *,SYMBOLS=(&EXECSYS,EXECSYS),LRECL=80
//DD000021 DD  *,SYMBOLS=(&JCLONLY,JCLONLY),LRECL=80
//DD000022 DD  *,SYMBOLS=(&CNVTSYS,&CNVTSYS),LRECL=80
//DD000023 DD  *,SYMBOLS=(&EXECSYS,&EXECSYS),LRECL=80
//DD000024 DD  *,SYMBOLS=(&JCLONLY,&JCLONLY),LRECL=80
//DD000025 DD  *,SYMBOLS=&CNVTSYS,LRECL=80
//DD000026 DD  *,SYMBOLS=&EXECSYS,LRECL=80
//DD000027 DD  *,SYMBOLS=&JCLONLY,LRECL=80
//DD000101 DD  *,SYMBOLS=CNVTSYS,LRECL=80 SYMBOLS
//DD000102 DD  *,SYMBOLS=EXECSYS,LRECL=80 SYMBOLS
//DD000103 DD  *,SYMBOLS=JCLONLY,LRECL=80 SYMBOLS
//DD000104 DD  *,SYMBOLS=(CNVTSYS),LRECL=80 SYMBOLS
//DD000105 DD  *,SYMBOLS=(EXECSYS),LRECL=80 SYMBOLS
//DD000106 DD  *,SYMBOLS=(JCLONLY),LRECL=80 SYMBOLS
//DD000107 DD  *,SYMBOLS=(CNVTSYS,LOGDD),LRECL=80 SYMBOLS
//DD000108 DD  *,SYMBOLS=(EXECSYS,LOGDD),LRECL=80 SYMBOLS
//DD000109 DD  *,SYMBOLS=(JCLONLY,LOGDD),LRECL=80 SYMBOLS
//DD000110 DD  *,SYMBOLS=(CNVTSYS,CNVTSYS),LRECL=80 SYMBOLS
//DD000111 DD  *,SYMBOLS=(EXECSYS,EXECSYS),LRECL=80 SYMBOLS
//DD000112 DD  *,SYMBOLS=(JCLONLY,JCLONLY),LRECL=80 SYMBOLS
//DD000113 DD  *,SYMBOLS=(CNVTSYS,&SYMBOLS),LRECL=80 SYMBOLS
//DD000114 DD  *,SYMBOLS=(EXECSYS,&SYMBOLS),LRECL=80 SYMBOLS
//DD000115 DD  *,SYMBOLS=(JCLONLY,&SYMBOLS),LRECL=80 SYMBOLS
//DD000116 DD  *,SYMBOLS=(&CNVTSYS),LRECL=80 SYMBOLS
//DD000117 DD  *,SYMBOLS=(&EXECSYS),LRECL=80 SYMBOLS
//DD000118 DD  *,SYMBOLS=(&JCLONLY),LRECL=80 SYMBOLS
//DD000119 DD  *,SYMBOLS=(&CNVTSYS,CNVTSYS),LRECL=80 SYMBOLS
//DD000120 DD  *,SYMBOLS=(&EXECSYS,EXECSYS),LRECL=80 SYMBOLS
//DD000121 DD  *,SYMBOLS=(&JCLONLY,JCLONLY),LRECL=80 SYMBOLS
//DD000122 DD  *,SYMBOLS=(&CNVTSYS,&CNVTSYS),LRECL=80 SYMBOLS
//DD000123 DD  *,SYMBOLS=(&EXECSYS,&EXECSYS),LRECL=80 SYMBOLS
//DD000124 DD  *,SYMBOLS=(&JCLONLY,&JCLONLY),LRECL=80 SYMBOLS
//DD000125 DD  *,SYMBOLS=&CNVTSYS,LRECL=80 SYMBOLS
//DD000126 DD  *,SYMBOLS=&EXECSYS,LRECL=80 SYMBOLS
//DD000127 DD  *,SYMBOLS=&JCLONLY,LRECL=80 SYMBOLS
