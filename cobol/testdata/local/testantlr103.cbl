000001 Identification Division.
000002 Program-ID. testantlr103.
000003 Data Division.
000004 Working-Storage Section.
000005 01  CONSTANTS.
000006     05  MYNAME               PIC X(012) VALUE 'testantlr103'.
000007 
000008
000009 Procedure Division.
000010     DISPLAY MYNAME ' Begin'
000011     
000012     CALL 'PGMA0001' USING MYNAME
000013
000014     DISPLAY MYNAME ' End'
000015     
000016     GOBACK
000017     .
000018
000019 1000-para.
000020
000021     .
000022
