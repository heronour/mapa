000001 Identification Division.                                         00000001
000002 Program-ID. testantlr305.                                        00000002
000003 Data Division.                                                   00000003
000004 Working-Storage Section.                                         00000004
000005 01  CONSTANTS.                                                   00000005
000006     05  MYNAME               PIC X(012) VALUE 'testantlr305'.    00000006
000007     05  PGM-0001             PIC X(008) VALUE 'PGMA0001'.        00000007
000008                                                                  00000008
000009 Procedure Division.                                              00000009
000010     DISPLAY MYNAME ' Begin'                                      00000010
000011                                                                  00000011
000012     CALL PGM-0001 USING MYNAME END-CALL                          00000012
000013                                                                  00000013
000014     GOBACK                                                       00000014
000015     .                                                            00000015
000016                                                                  00000016
000017 1000-para.                                                       00000017
000018                                                                  00000018
000019     .                                                            00000019
000020                                                                  00000020
