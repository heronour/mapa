000001 Identification Division.
000002 Program-ID. testantlr106.
000003 Data Division.
000004 Working-Storage Section.
000005
000006 01  CONSTANTS.
000007     05  MYNAME               PIC X(012) VALUE 'testantlr106'.
000008
000009 Procedure Division.
000010     DISPLAY MYNAME ' Begin'
000011     
000012     EXEC CICS LINK PROGRAM('PGMA0001') END-EXEC
000013
000014     GOBACK
000015     .
000016
000017 1000-para.
000018
000019     .
000020
