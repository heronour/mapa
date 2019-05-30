000001 Identification Division.
000002 Program-ID. testantlr118.
000003 Data Division.
000004 Working-Storage Section.
000005
000006 01  CONSTANTS.
000007     05  MYNAME               PIC X(012) VALUE 'testantlr118'.
000008
000009 01 WORK-AREAS.
000010    05  PGM-0004              PIC X(008) VALUE SPACES.
000011    05  PGM-0005              PIC X(008) VALUE SPACES.
000012        88  PGMB5                        VALUE 'PGMB0005'.
000013    05  ABC.
000014        10  PGM-0010          PIC X(008) VALUE 'PGMM0010'.
000015    05  DEF.
000016        10  PGM-0010          PIC X(008) VALUE 'PGMN0010'.
000017    05  GHI.
000018        10  ABC.
000019            15  PGM-0010      PIC X(008) VALUE 'PGMO0010'.
000020    05  PGM-TO-LINK           PIC X(008) VALUE 'PGML0013'.
000021    05  PGM-TO-XCTL           PIC X(008) VALUE 'PGMX0014'.
000022
000023 Procedure Division.
000024     DISPLAY MYNAME ' Begin'
000025     
000026     CALL PGM-0010 OF ABC OF GHI
000027
000028     DISPLAY MYNAME ' End'
000029     
000030     GOBACK
000031     .
000032
000033
