//SYSOUT JOB
//*
//STEP0001 EXEC PGM=IEFBR14
//DD000001 DD  SYSOUT=*
//DD000002 DD  SYSOUT=$
//DD000003 DD  SYSOUT=A
//DD000004 DD  SYSOUT=1
//DD000005 DD  SYSOUT='*'
//DD000006 DD  SYSOUT='$'
//DD000007 DD  SYSOUT='A'
//DD000008 DD  SYSOUT='1'
//DD000009 DD  SYSOUT=(,)
//DD000010 DD  SYSOUT=(*,INTRDR)
//DD000011 DD  SYSOUT=($,INTRDR)
//DD000012 DD  SYSOUT=(A,INTRDR)
//DD000013 DD  SYSOUT=(1,INTRDR)
//DD000014 DD  SYSOUT=('*',INTRDR)
//DD000015 DD  SYSOUT=('$',INTRDR)
//DD000016 DD  SYSOUT=('A',INTRDR)
//DD000017 DD  SYSOUT=('1',INTRDR)
//DD000018 DD  SYSOUT=(*,ABCDEFGH)
//DD000019 DD  SYSOUT=($,ABCDEFGH)
//DD000020 DD  SYSOUT=(A,ABCDEFGH)
//DD000021 DD  SYSOUT=(1,ABCDEFGH)
//DD000022 DD  SYSOUT=('*',ABCDEFGH)
//DD000023 DD  SYSOUT=('$',ABCDEFGH)
//DD000024 DD  SYSOUT=('A',ABCDEFGH)
//DD000025 DD  SYSOUT=('1',ABCDEFGH)
//DD000026 DD  SYSOUT=(*,X1234567)
//DD000027 DD  SYSOUT=($,X1234567)
//DD000028 DD  SYSOUT=(A,X1234567)
//DD000029 DD  SYSOUT=(1,X1234567)
//DD000030 DD  SYSOUT=('*',X1234567)
//DD000031 DD  SYSOUT=('$',X1234567)
//DD000032 DD  SYSOUT=('A',X1234567)
//DD000033 DD  SYSOUT=('1',X1234567)
//DD000034 DD  SYSOUT=(*,X1234567,A@2#)
//DD000035 DD  SYSOUT=($,X1234567,A@2#)
//DD000036 DD  SYSOUT=(A,X1234567,A@2#)
//DD000037 DD  SYSOUT=(1,X1234567,A@2#)
//DD000038 DD  SYSOUT=('*',X1234567,A@2#)
//DD000039 DD  SYSOUT=('$',X1234567,A@2#)
//DD000040 DD  SYSOUT=('A',X1234567,A@2#)
//DD000041 DD  SYSOUT=('1',X1234567,A@2#)
//DD000042 DD  SYSOUT=(*,,A@2#)
//DD000043 DD  SYSOUT=($,,A@2#)
//DD000044 DD  SYSOUT=(A,,A@2#)
//DD000045 DD  SYSOUT=(1,,A@2#)
//DD000046 DD  SYSOUT=('*',,A@2#)
//DD000047 DD  SYSOUT=('$',,A@2#)
//DD000048 DD  SYSOUT=('A',,A@2#)
//DD000049 DD  SYSOUT=('1',,A@2#)
//DD000050 DD  SYSOUT=&SYSOUT
//DD000051 DD  SYSOUT=(&SYSOUT)
//DD000052 DD  SYSOUT=(&SYSOUT,&WRITER)
//DD000053 DD  SYSOUT=(&SYSOUT,&WRITER,&FORM)
//DD000054 DD  SYSOUT=(&SYSOUT,,&FORM)
//DD000055 DD  SYSOUT=(A,&WRITER)
//DD000056 DD  SYSOUT=(A,&WRITER,&FORM)
//DD000057 DD  SYSOUT=(A,,&FORM)
//DD000058 DD  SYSOUT=(*)
//DD000059 DD  SYSOUT=($)
//DD000060 DD  SYSOUT=(A)
//DD000061 DD  SYSOUT=(1)
//DD000062 DD  SYSOUT=('*')
//DD000063 DD  SYSOUT=('$')
//DD000064 DD  SYSOUT=('A')
//DD000065 DD  SYSOUT=('1')
//DD000101 DD  SYSOUT=* SYSOUT
//DD000102 DD  SYSOUT=$ SYSOUT
//DD000103 DD  SYSOUT=A SYSOUT
//DD000104 DD  SYSOUT=1 SYSOUT
//DD000105 DD  SYSOUT='*' SYSOUT
//DD000106 DD  SYSOUT='$' SYSOUT
//DD000107 DD  SYSOUT='A' SYSOUT
//DD000108 DD  SYSOUT='1' SYSOUT
//DD000109 DD  SYSOUT=(,) SYSOUT
//DD000110 DD  SYSOUT=(*,INTRDR) SYSOUT
//DD000111 DD  SYSOUT=($,INTRDR) SYSOUT
//DD000112 DD  SYSOUT=(A,INTRDR) SYSOUT
//DD000113 DD  SYSOUT=(1,INTRDR) SYSOUT
//DD000114 DD  SYSOUT=('*',INTRDR) SYSOUT
//DD000115 DD  SYSOUT=('$',INTRDR) SYSOUT
//DD000116 DD  SYSOUT=('A',INTRDR) SYSOUT
//DD000117 DD  SYSOUT=('1',INTRDR) SYSOUT
//DD000118 DD  SYSOUT=(*,ABCDEFGH) SYSOUT
//DD000119 DD  SYSOUT=($,ABCDEFGH) SYSOUT
//DD000120 DD  SYSOUT=(A,ABCDEFGH) SYSOUT
//DD000121 DD  SYSOUT=(1,ABCDEFGH) SYSOUT
//DD000122 DD  SYSOUT=('*',ABCDEFGH) SYSOUT
//DD000123 DD  SYSOUT=('$',ABCDEFGH) SYSOUT
//DD000124 DD  SYSOUT=('A',ABCDEFGH) SYSOUT
//DD000125 DD  SYSOUT=('1',ABCDEFGH) SYSOUT
//DD000126 DD  SYSOUT=(*,X1234567) SYSOUT
//DD000127 DD  SYSOUT=($,X1234567) SYSOUT
//DD000128 DD  SYSOUT=(A,X1234567) SYSOUT
//DD000129 DD  SYSOUT=(1,X1234567) SYSOUT
//DD000130 DD  SYSOUT=('*',X1234567) SYSOUT
//DD000131 DD  SYSOUT=('$',X1234567) SYSOUT
//DD000132 DD  SYSOUT=('A',X1234567) SYSOUT
//DD000133 DD  SYSOUT=('1',X1234567) SYSOUT
//DD000134 DD  SYSOUT=(*,X1234567,A@2#) SYSOUT
//DD000135 DD  SYSOUT=($,X1234567,A@2#) SYSOUT
//DD000136 DD  SYSOUT=(A,X1234567,A@2#) SYSOUT
//DD000137 DD  SYSOUT=(1,X1234567,A@2#) SYSOUT
//DD000138 DD  SYSOUT=('*',X1234567,A@2#) SYSOUT
//DD000139 DD  SYSOUT=('$',X1234567,A@2#) SYSOUT
//DD000140 DD  SYSOUT=('A',X1234567,A@2#) SYSOUT
//DD000141 DD  SYSOUT=('1',X1234567,A@2#) SYSOUT
//DD000142 DD  SYSOUT=(*,,A@2#) SYSOUT
//DD000143 DD  SYSOUT=($,,A@2#) SYSOUT
//DD000144 DD  SYSOUT=(A,,A@2#) SYSOUT
//DD000145 DD  SYSOUT=(1,,A@2#) SYSOUT
//DD000146 DD  SYSOUT=('*',,A@2#) SYSOUT
//DD000147 DD  SYSOUT=('$',,A@2#) SYSOUT
//DD000148 DD  SYSOUT=('A',,A@2#) SYSOUT
//DD000149 DD  SYSOUT=('1',,A@2#) SYSOUT
//DD000150 DD  SYSOUT=&SYSOUT SYSOUT
//DD000151 DD  SYSOUT=(&SYSOUT) SYSOUT
//DD000152 DD  SYSOUT=(&SYSOUT,&WRITER) SYSOUT
//DD000153 DD  SYSOUT=(&SYSOUT,&WRITER,&FORM) SYSOUT
//DD000154 DD  SYSOUT=(&SYSOUT,,&FORM) SYSOUT
//DD000155 DD  SYSOUT=(A,&WRITER) SYSOUT
//DD000156 DD  SYSOUT=(A,&WRITER,&FORM) SYSOUT
//DD000157 DD  SYSOUT=(A,,&FORM) SYSOUT
//DD000158 DD  SYSOUT=(*) SYSOUT
//DD000159 DD  SYSOUT=($) SYSOUT
//DD000160 DD  SYSOUT=(A) SYSOUT
//DD000161 DD  SYSOUT=(1) SYSOUT
//DD000162 DD  SYSOUT=('*') SYSOUT
//DD000163 DD  SYSOUT=('$') SYSOUT
//DD000164 DD  SYSOUT=('A') SYSOUT
//DD000165 DD  SYSOUT=('1') SYSOUT

