//AEIOU JOB
//*
//STEP001  EXEC PGM=IEFBR14
//STEP002  EXEC PGM=IEFBR14,TVSAMCOM=(0,0)
//STEP002A EXEC PGM=IEFBR14,TVSAMCOM=(1,0)
//STEP002B EXEC PGM=IEFBR14,TVSAMCOM=(1,3)
//STEP002C EXEC PGM=IEFBR14,TVSAMCOM=(&TV1,0)
//STEP002D EXEC PGM=IEFBR14,
// TVSAMCOM=(0,0)
//STEP002E EXEC PGM=IEFBR14,
// TVSAMCOM=(1,0)
//STEP002F EXEC PGM=IEFBR14,
// TVSAMCOM=(1,3)
//STEP002G EXEC PGM=IEFBR14,
// TVSAMCOM=(1,&TV2)
//STEP002  EXEC PGM=IEFBR14,TVSAMCOM=(0,0) TVSMSG
//STEP002A EXEC PGM=IEFBR14,TVSAMCOM=(1,0) TVSMSG
//STEP002B EXEC PGM=IEFBR14,TVSAMCOM=(1,3) TVSMSG
//STEP002C EXEC PGM=IEFBR14,TVSAMCOM=(&TV1,&TV2) TVSMSG
//STEP002D EXEC PGM=IEFBR14,
// TVSAMCOM=(0,0) TVSMSG
//STEP002E EXEC PGM=IEFBR14,
// TVSAMCOM=(1,0) TVSMSG
//STEP002F EXEC PGM=IEFBR14,
// TVSAMCOM=(1,3) TVSMSG
//STEP002G EXEC PGM=IEFBR14,
// TVSAMCOM=(3,7) TVSMSG
