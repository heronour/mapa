//AEIOU JOB
//*
//STEP001  EXEC PGM=IEFBR14,RD=R
//STEP002  EXEC PGM=IEFBR14,PARM=X,RD=NR
//STEP002A EXEC PGM=IEFBR14,PARM=XX,RD=NC
//STEP002B EXEC PGM=IEFBR14,PARM=1,RD=&RD
//STEP009  EXEC PGM=IEFBR14,PARM=ZZ&A.1,RD=RNC
//STEP010  EXEC PGM=IEFBR14,PARM='AND A ONE AND A TWO AND
//       A THREE AND A FOUR',RD=RNC
//STEP011  EXEC PGM=IEFBR14,PARM=(A,B,C,D,E,F,G),RD=RNC
//STEP012  EXEC PGM=IEFBR14,PARM=(A,              PARM 1
//  B,                                            PARM 2
//    C,                                          PARM 3
// D,                                             PARM 4
//         E,                                     PARM 5
//      F,                                        PARM 6
//        G),RD=RNC                          PARM 7
//STEP013  EXEC PGM=IEFBR14,
// PARM=(A,
// B,
// C,
// D,
// E,F,
//         G),RD=RNC
//STEP014  EXEC PGM=IEFBR14,PARM=('ABC',&A,7,'BLAH
//  BLAH BLAH'),RD=RNC
//STEP015  EXEC PGM=IEFBR14,PARM=X,RD=RNC moo
//STEP016  EXEC IAYEAYE,PARM.STEPA=X,RD.STEPA=RNC
//STEP017  EXEC IAYEAYE,PARM.STEPA=X,PARM.STEPB=Y,RD.STEPC=R
//STEP018  EXEC IAYEAYE,
// PARM.STEPA=(A,B,C),
// PARM.STEPB=(D,E,F),
// RD.STEPC=R
//STEP019  EXEC IAYEAYE,
// PARM.STEPA=(&A1,&B2,&C3),
// PARM.STEPB=(&D4,&E5,&F6),
// RD.STEPC=&RD
//STEP020  EXEC IAYEAYE,
// PARM.STEPA=(&A1,&B2,&C3),
// PARM.STEPB=(&D4,&E5,&F6),
// PARM.STEPC=(&A1,&B2,&C3,&D4),
// PARM.STEPD=(&A1,
// &B2,&C3,&D4,&E5,&F6),
// RD.STEPE=&RDSTEPE
