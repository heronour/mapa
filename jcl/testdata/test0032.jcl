//EDSEL JOB
//*
//STEP001  EXEC PGM=IEFBR14,ACCT=A,COND=EVEN,TVSMSG=COMMIT
//STEP002  EXEC PGM=IEFBR14,PARM=X,ACCT='A',,COND=ONLY,TVSMSG=COMMIT
//STEP002A EXEC PGM=IEFBR14,PARM=XX,ACCT=(A),COND=(4,GT,STEP001),
// TVSMSG=COMMIT
//STEP002B EXEC PGM=IEFBR14,PARM=1,ACCT=('A'),
// COND=((16,GE),(90,LE,STEP001),ONLY),TVSMSG=&DYNAM1&DYNAM2&DYNAM3
//STEP002C EXEC PGM=IEFBR14,PARM=12,ACCT=(A,B),
//   COND=((8,LT,STEP001),(8,GT,STEP001A)),TVSMSG=COMMIT
//STEP002D EXEC PGM=IEFBR14,PARM=#,ACCT=('A',B),TVSMSG=COMMIT,
// COND=((16,GE),(90,LE,STEP001),(31,EQ,STEP002B),EVEN)
//STEP002E EXEC PGM=IEFBR14,PARM=#$,ACCT=(A,'B'),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN),TVSMSG=COMMIT
//STEP002F EXEC PGM=IEFBR14,PARM=X1,ACCT=A1,
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN),
//  TVSMSG=COMMIT
//STEP002G EXEC PGM=IEFBR14,PARM=XX1,ACCT='A1',TVSMSG=COMMIT,
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002H EXEC PGM=IEFBR14,PARM=XX11,ACCT=(A1),TVSMSG=COMMIT,
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002I EXEC PGM=IEFBR14,PARM=1X,ACCT=('A1'),TVSMSG=COMMIT,
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002J EXEC PGM=IEFBR14,PARM=11X,ACCT=(A1,B2),TVSMSG=COMMIT,
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002K EXEC PGM=IEFBR14,PARM=11XX,ACCT=('A1',B2),TVSMSG=COMMIT,
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002L EXEC PGM=IEFBR14,PARM=X@,ACCT=(A1,'B2'),TVSMSG=COMMIT,
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002M EXEC PGM=IEFBR14,PARM=XX@,ACCT=('A1','B2'),TVSMSG=COMMIT,
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002N EXEC PGM=IEFBR14,PARM=XX@@,ACCT='A1$',TVSMSG=COMMIT,
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP002O EXEC PGM=IEFBR14,PARM=1@,ACCT=('A1$'),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN),TVSMSG=COMMIT
//STEP002P EXEC PGM=IEFBR14,PARM=11@,ACCT=('A1$','B2+'),
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN),TVSMSG=COMMIT
//STEP006  EXEC PGM=IEFBR14,PARM=&AB,COND=(4,LT),TVSMSG=COMMIT
//STEP007  EXEC PGM=IEFBR14,PARM=&A.1,COND=(0,NE),TVSMSG=COMMIT
//STEP008  EXEC PGM=IEFBR14,PARM=ZZ&A,COND=EVEN,TVSMSG=COMMIT
//STEP009  EXEC PGM=IEFBR14,PARM=ZZ&A.1,COND=ONLY,TVSMSG=COMMIT
//STEP010  EXEC PGM=IEFBR14,PARM='AND A ONE AND A TWO AND
//       A THREE AND A FOUR',
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN),TVSMSG=COMMIT
//STEP010A EXEC PGM=IEFBR14,PARM='AND A ONE AND A TWO AND
//       A THREE AND A FOUR',TVSMSG=BACKOUT,
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP011  EXEC PGM=IEFBR14,PARM=(A,B,C,D,E,F,G),COND=(7,NE),
// TVSMSG=COMMIT
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
//  EVEN),TVSMSG=COMMIT
//STEP012A EXEC PGM=IEFBR14,PARM=(A,              PARM 1
//  B,                                            PARM 2
//    C,                                          PARM 3
// D,                                             PARM 4
//         E,                                     PARM 5
//      F,                                        PARM 6
//        G),TVSMSG=ALL,                         PARM 7
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
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
//  EVEN),TVSMSG=COMMIT
//STEP013A EXEC PGM=IEFBR14,
// PARM=(A,
// B,
// C,
// D,
// E,F,
//         G),TVSMSG=&TVSMSG,
// COND=((16,GE),
//  (90,LE,STEP001),
//  (31,EQ,STEP002B),
//  EVEN)
//STEP014  EXEC PGM=IEFBR14,PARM=('ABC',&A,7,'BLAH
//  BLAH BLAH'),COND=(333,EQ,STEP011),TVSMSG=COMMIT
//STEP015  EXEC PGM=IEFBR14,PARM=X,COND=ONLY,TVSMSG=COMMIT moo