//EDSEL JOB
//*
//STEP001  EXEC PGM=IEFBR14,ACCT=A,COND=EVEN,TIME=(2,3)
//STEP002  EXEC PGM=IEFBR14,PARM=X,ACCT='A',,COND=ONLY,TIME=(2,3)
//STEP002A EXEC PGM=IEFBR14,PARM=XX,ACCT=(A),COND=(4,GT,STEP001),
// TIME=(2,3)
//STEP002B EXEC PGM=IEFBR14,PARM=1,ACCT=('A'),
// COND=((16,GE),(90,LE,STEP001),ONLY),TIME=(&T1,&T2)
//STEP002C EXEC PGM=IEFBR14,PARM=12,ACCT=(A,B),
//   COND=((8,LT,STEP001),(8,GT,STEP001A)),TIME=(2,3)
//STEP002D EXEC PGM=IEFBR14,PARM=#,ACCT=('A',B),TIME=(2,3),
// COND=((16,GE),(90,LE,STEP001),(31,EQ,STEP002B),EVEN)
//STEP002E EXEC PGM=IEFBR14,PARM=#$,ACCT=(A,'B'),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN),TIME=(2,3)
//STEP002F EXEC PGM=IEFBR14,PARM=X1,ACCT=A1,
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN),
//  TIME=(2,3)
//STEP002G EXEC PGM=IEFBR14,PARM=XX1,ACCT='A1',TIME=(2,3),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002H EXEC PGM=IEFBR14,PARM=XX11,ACCT=(A1),TIME=(2,3),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002I EXEC PGM=IEFBR14,PARM=1X,ACCT=('A1'),TIME=(2,3),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002J EXEC PGM=IEFBR14,PARM=11X,ACCT=(A1,B2),TIME=(2,3),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002K EXEC PGM=IEFBR14,PARM=11XX,ACCT=('A1',B2),TIME=(2,3),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002L EXEC PGM=IEFBR14,PARM=X@,ACCT=(A1,'B2'),TIME=(2,3),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002M EXEC PGM=IEFBR14,PARM=XX@,ACCT=('A1','B2'),TIME=(2,3),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002N EXEC PGM=IEFBR14,PARM=XX@@,ACCT='A1$',TIME=(2,3),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002O EXEC PGM=IEFBR14,PARM=1@,ACCT=('A1$'),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN),TIME=(2,3)
//STEP002P EXEC PGM=IEFBR14,PARM=11@,ACCT=('A1$','B2+'),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN),TIME=(2,3)
//STEP005  EXEC IAYEBR14,      exec
// PARM.STEPA=&A,              parm
// ACCT.STEPA=A1,              acctA
// ACCT.STEPB=('A1+','B2(1)'), acctB
// TIME.STEPC=&TM,             timeC
// COND=((16,GE),              any16
//  (90,LE,STEP001),           step001le90
//  (31,EQ,STEP002B.STEPX),    step002beq31
//  EVEN)                      even
//STEP006  EXEC PGM=IEFBR14,PARM=&AB,COND=(4,LT),TIME=(2,3)
//STEP007  EXEC PGM=IEFBR14,PARM=&A.1,COND=(0,NE),TIME=(2,3)
//STEP008  EXEC PGM=IEFBR14,PARM=ZZ&A,COND=EVEN,TIME=(2,3)
//STEP009  EXEC PGM=IEFBR14,PARM=ZZ&A.1,COND=ONLY,TIME=(2,3)
//STEP010  EXEC PGM=IEFBR14,PARM='AND A ONE AND A TWO AND
//       A THREE AND A FOUR',
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN),TIME=(2,3)
//STEP011  EXEC PGM=IEFBR14,PARM=(A,B,C,D,E,F,G),COND=(7,NE),
// TIME=(2,3)
//STEP012  EXEC PGM=IEFBR14,PARM=(A,              PARM 1
//  B,                                            PARM 2
//    C,                                          PARM 3
// D,                                             PARM 4
//         E,                                     PARM 5
//      F,                                        PARM 6
//        G),                                     PARM 7
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN),TIME=(2,3)
//STEP013  EXEC PGM=IEFBR14,
// PARM=(A,
// B,
// C,
// D,
// E,F,
//         G),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN),TIME=(2,3)
//STEP014  EXEC PGM=IEFBR14,PARM=('ABC',&A,7,'BLAH
//  BLAH BLAH'),COND=(333,EQ,STEP011),TIME=(2,3)
//STEP015  EXEC PGM=IEFBR14,PARM=X,COND=ONLY,TIME=(2,3) moo
//STEP016  EXEC PROC=IAYEAYE,
// PARM.STEPA=&A,              parm
// ACCT.STEPA=A1,              acctA
// TIME.STEPA=10,              timeA
// ACCT.STEPB=('A1+','B2(1)'), acctB
// TIME.STEPB=(10),            timeB
// TIME.STEPC=&TM,             timeC
// TIME.STEPD=(,10),
// TIME.STEPE=(1,10),
// COND=((16,GE),              any16
//  (90,LE,STEP001),           step001le90
//  (31,EQ,STEP002B.STEPX),    step002beq31
//  EVEN)                      even
//STEP017  EXEC PROC=IAYEAYE,
// APARM1='ALEX',
// PARM.STEPA=&A,              parm
// APARM2='AMOS',
// ACCT.STEPA=A1,              acctA
// APARM3='BOBBIE',
// TIME.STEPA=10,              timeA
// APARM4='CLARISSA',
// ACCT.STEPB=('A1+','B2(1)'), acctB
// APARM5='JAMES',
// TIME.STEPB=(10),            timeB
// APARM6='NAOMI',
// TIME.STEPC=&TM,             timeC
// APARM7=THE_EXPANSE,
// TIME.STEPD=(,10),
// TIME.STEPE=(1,10),
// COND=((16,GE),              any16
//  (90,LE,STEP001),           step001le90
//  (31,EQ,STEP002B.STEPX),    step002beq31
//  EVEN)                      even

