//CM JOB
//*
//STP4  EXEC PROC=BILLING,COND.PAID=((20,LT),EVEN),
//     COND.LATE=(60,GT,FIND),
//     COND.BILL=((20,GE),(30,LT,CHGE))  THIS STATEMENT CALLS          X
//     THE BILLING PROCEDURE AND SPECIFIES RETURN CODE TESTS           X
//     FOR THREE PROCEDURE STEPS.
//DD1  DD   DSNAME=SWITCH.LEVEL18.GROUP12,UNIT=3390,
//     VOLUME=339023,SPACE=(TRK,(80,15)),DISP=(,PASS)
