//DDNAME JOB 
//*
//STEP0001 EXEC PGM=IEBGENER
//SYSIN    DD  DDNAME=INPUT01
//         DD  DDNAME=INPUT02
//*
//STEP0002 EXEC PGM=IEFBR14
//DD000001 DD  DDNAME=
//DD000002 DD  DDNAME=ABC
