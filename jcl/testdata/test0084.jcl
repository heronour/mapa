//MODIFY JOB
//*
//STEP0001 EXEC PGM=OUTPUT
//DD000001 DD  MODIFY=A
//DD000002 DD  MODIFY=1
//DD000003 DD  MODIFY=@
//DD000004 DD  MODIFY=#A1$
//DD000005 DD  MODIFY=A1$@
//DD000006 DD  MODIFY=1A##
//DD000011 DD  MODIFY=(A)
//DD000012 DD  MODIFY=(1)
//DD000013 DD  MODIFY=(@)
//DD000014 DD  MODIFY=(#A1$)
//DD000015 DD  MODIFY=(A1$@)
//DD000016 DD  MODIFY=(1A##)
//DD000021 DD  MODIFY=(A,1)
//DD000022 DD  MODIFY=(1,2)
//DD000023 DD  MODIFY=(@,32768)
//DD000024 DD  MODIFY=(#A1$,314159)
//DD000025 DD  MODIFY=(A1$@,0)
//DD000026 DD  MODIFY=(1A##,255)
//DD000101 DD  MODIFY=A MODIFY
//DD000102 DD  MODIFY=1 MODIFY
//DD000103 DD  MODIFY=@ MODIFY
//DD000104 DD  MODIFY=#A1$ MODIFY
//DD000105 DD  MODIFY=A1$@ MODIFY
//DD000106 DD  MODIFY=1A## MODIFY
//DD000111 DD  MODIFY=(A) MODIFY
//DD000112 DD  MODIFY=(1) MODIFY
//DD000113 DD  MODIFY=(@) MODIFY
//DD000114 DD  MODIFY=(#A1$) MODIFY
//DD000115 DD  MODIFY=(A1$@) MODIFY
//DD000116 DD  MODIFY=(1A##) MODIFY
//DD000121 DD  MODIFY=(A,1) MODIFY
//DD000122 DD  MODIFY=(1,2) MODIFY
//DD000123 DD  MODIFY=(@,32768) MODIFY
//DD000124 DD  MODIFY=(#A1$,314159) MODIFY
//DD000125 DD  MODIFY=(A1$@,0) MODIFY
//DD000126 DD  MODIFY=(1A##,255) MODIFY
