//DCB JOB ,
//*
//STEP0001 EXEC PGM=IEFBR14
//DD000001 DD  DCB=(BFALN=F,BFTEK=F,BLKSIZE=27998,BUFIN=1,
// BUFL=1,BUFMAX=2,BUFNO=1,BUFOFF=0,BUFOUT=1,BUFSIZE=1,CPRI=R,
// CYLOFL=1,DEN=1,DIAGNS=TRACE,DSORG=PS,EROPT=ACC,FUNC=X,GNCP=1,
// INTVL=0,IPLTXID=THISONE,KEYLEN=0,LIMCT=7,LRECL=1,MODE=C,NCP=1,
// NTM=1,OPTCD=A,PCI=N,PRTSP=0,RECFM=F,RESERVE=(0,0),RKP=1,STACK=1,
// THRESH=0,TRTCH=C),DSN=AEIOU.ZZZZZZZZ.YYYYYYYY.XXXXXXXX
//DD000002 DD  DSN=&SYSUID..TEST,DCB=(LRECL=80,RECFM=FB,BLKSIZE=8000)
//DD000003 DD  DSN='QUOTED.DSN',DCB=BFALN=&BFALN
//DD000004 DD  DCB=(RECFM=FB,LRECL=&LRECL,BLKSIZE=&BLKSIZE),DSN=A.B.C
//DD000005 DD  DCB=BFTEK=R,
//             DSN=DSN
//DD000006 DD  DCB=(BFALN=&BFALN,BFTEK=&BFTEK,BLKSIZE=27998,BUFIN=1,
// BUFL=1,BUFMAX=2,BUFNO=1,BUFOFF=0,BUFOUT=1,BUFSIZE=1,CPRI=R,
// CYLOFL=1,DEN=1,DIAGNS=TRACE,DSORG=PS,EROPT=ACC,FUNC=X,GNCP=1,
// INTVL=0,IPLTXID=THISONE,KEYLEN=0,LIMCT=7,LRECL=1,MODE=C,NCP=1,
// NTM=1,OPTCD=ABCEFHIJLQRTUWZ,PCI=(N,A),PRTSP=9,RECFM=&RECFM,
// RESERVE=(&RESERVE1,&RESERVE2),RKP=1,STACK=1,
// THRESH=0,TRTCH=C),DSN=A.&SECOND
//DD000006 DD  DCB=BFTEK=D,DSN=B.&SECOND..THIRD
//DD000007 DD  DCB=BFTEK=S,DSN=C.&SECOND..&THIRD
//DD000008 DD  DCB=BFTEK=A,DSN=&FIRST..&SECOND..&THIRD
//DD000009 DD  DCB=BFTEK=&BFTEK,DSN=&A..B.&C..D
//DD000010 DD  DCB=(RECFM=&RECFM,LRECL=&LRECL,BLKSIZE=&BLKSIZE),
//             DSN=A.B.C
//DD000011 DD  DCB=BLKSIZE=27K,DSN=A.B.&C(M)
//DD000012 DD  DCB=BLKSIZE=10M,DSN=A.&B..C(M)
//DD000013 DD  DCB=BLKSIZE=1G,DSN=&A..&B..&C(M)
//DD000014 DD  DCB=BLKSIZE=&BLKSIZE,DSN=&A.B.&B.C.&C.D(&M.M)
//DD000015 DD  DCB=(PCI=(N,A)),DSN=A.B.C(M)
//DD000016 DD  DCB=BUFIN=65535,DSN=A.B.C(&M)
//DD000017 DD  DCB=BUFIN=&BUFIN,DSN=&A..B.C(&M)
//DD000018 DD  DSN=&DSN(&MEMBER),DCB=(RESERVE=(255,255))
//DD000019 DD  BUFL=32760,DSN=#&A..$&B(-1)
//DD000020 DD  DSN=AEIOU(0),BUFL=&BUFL
//DD000021 DD  DSN=&DSN(&MEMBER),DCB=(PCI=(N,&PCI2))
//DD000022 DD  DSN=THIS.IS.A.GDG.G0001V00,DCB=BUFMAX=15
//DD000023 DD  DCB=BUFMAX=255,DSN=THIS.IS.ALSO.A.GDG(+1)
//DD000024 DD  DCB=BUFMAX=&BUFMAX,DSN='QUOTED.DSN'
//DD000025 DD  DSN='QUOTED.DSN',DCB=(RESERVE=(3,&RESERVE2))
//DD000026 DD  DSN=DCB.DATA,DCB=BUFNO=255
//DD000027 DD  DSN=BUFNO.DATA,BUFNO=1000
//DD000028 DD  DCB=BUFNO=&BUFNO,DSN=BUFNO(0)
//DD000029 DD  DCB=(PCI=(A,A),RESERVE=(0,0)),DSN=DCB
//DD000030 DD  DSN=DCB,DCB=BUFOFF=7
//DD000031 DD  DSN=BUFOFF,BUFOFF=99
//DD000032 DD  DCB=(A.B.C)
//DD000033 DD  DCB=(*.DD000001,LRECL=X)
//DD000034 DD  DCB=(A.B.C,RESERVE=(1,1),PCI=(A,A))
//DD000035 DD  DCB=A.B.C
//DD000036 DD  DCB=*.STEP.DD
//DD000037 DD  DCB=*.STEP.PROCSTEP.DD
//DD000038 DD  DCB=(EGGS,RESERVE=(&RESERVE1,&RESERVE2),PCI=(&PCI1,&PCI2))
//DD000039 DD  DCB=(*.STEP.DD,BUFSIZE=255)
//DD000040 DD  DCB=(*.STEP.PROCSTEP.DD,BUFSIZE=65535)
//DD000041 DD  DCB=(&A..&B..&C,BUFSIZE=&BUFSIZE)
//DD000042 DD  DCB=(*.DD,PCI=(A,N),BUFSIZE=255,RESERVE=(5,5))
//DD000043 DD  DCB=CPRI=E
//DD000044 DD  DCB=CPRI=S
//DD000045 DD  DCB=CPRI=&CPRI
//DD000046 DD  DCB=(TRTCH=COMP,PCI=(N,N))
//DD000047 DD  DCB=CYLOFL=255
//DD000048 DD  DCB=CYLOFL=999999
//DD000049 DD  DCB=CYLOFL=&CYLOFL
//DD000050 DD  DCB=(OPTCD=C,RESERVE=(0,0))
//DD000051 DD  DCB=DEN=2
//DD000052 DD  DCB=DEN=3
//DD000053 DD  DCB=DEN=4
//DD000054 DD  DCB=DEN=99
//DD000055 DD  DCB=DEN=&DEN
//DD000056 DD  DCB=DIAGNS=TRACE
//DD000057 DD  DCB=(LRECL=X,OPTCD=C,TRTCH=NOCOMP)
//DD000058 DD  DCB=DSORG=PSU
//DD000059 DD  DCB=DSORG=DA
//DD000060 DD  DCB=DSORG=DAU
//DD000061 DD  DCB=DSORG=PO
//DD000062 DD  DCB=DSORG=POU
//DD000063 DD  DCB=DSORG=CX
//DD000064 DD  DCB=DSORG=GS
//DD000065 DD  DCB=DSORG=&DSORG
//DD000066 DD  DCB=(MODE=R,PCI=(N,N))
//DD000067 DD  DCB=EROPT=SKP
//DD000068 DD  DCB=EROPT=ABE
//DD000069 DD  DCB=EROPT=&ERROPT
//DD000079 DD  DCB=(MODE=CO,RESERVE=(0,0),LRECL=33,PCI=(A,A),FUNC=IR)
//DD000080 DD  DCB=FUNC=I
//DD000081 DD  DCB=FUNC=WT
//DD000082 DD  DCB=FUNC=RWT
//DD000083 DD  DCB=FUNC=RPWXT
//DD000084 DD  DCB=FUNC=PWX
//DD000085 DD  DCB=FUNC=R
//DD000086 DD  DCB=FUNC=RP
//DD000087 DD  DCB=FUNC=PW
//DD000088 DD  DCB=FUNC=RPWD     
//DD000089 DD  DCB=FUNC=RPWX
//DD000090 DD  DCB=FUNC=P
//DD000091 DD  DCB=FUNC=RPD
//DD000092 DD  DCB=FUNC=PWXT
//DD000093 DD  DCB=FUNC=RWX
//DD000094 DD  DCB=FUNC=RWX
//DD000095 DD  DCB=FUNC=W
//DD000096 DD  DCB=FUNC=RW
//DD000097 DD  DCB=FUNC=RPW
//DD000098 DD  DCB=FUNC=RWXT
//DD000099 DD  DCB=FUNC=&FUNC
//DD000100 DD  DCB=(FUNC=IRPWDXT,LRECL=&LRECL,PCI=(&PCI1,&PCI2))
//DD000101 DD  DCB=GNCP=100
//DD000102 DD  DCB=GNCP=&GNCP
//DD000103 DD  DCB=(GNCP=0,
//             FUNC=RWX,
//             LRECL=84,
//             RECFM=VBS,
//             BLKSIZE=27988)
//DD000104 DD  DCB=INTVL=65535
//DD000105 DD  DCB=(INTVL=255,MODE=CO,
//             RECFM=FBA)
//DD000106 DD  DCB=IPLTXID=@3704#01
//DD000107 DD  DCB=IPLTXID=&IPLTXID
//DD000108 DD  DCB=(FUNC=W,LRECL=X)
//DD000109 DD  DCB=KEYLEN=255
//DD000110 DD  DCB=KEYLEN=99999
//DD000111 DD  DCB=KEYLEN=&KEYLEN
//DD000112 DD  DCB=(FUNC=W,
//             LRECL=4K)
//DD000113 DD  DCB=LIMCT=4096
//DD000114 DD  DCB=LIMCT=&LIMCT
//DD000115 DD  DCB=(LRECL=4K,
//             FUNC=RPW)
//DD000116 DD  DCB=LRECL=255
//DD000117 DD  DCB=LRECL=65535
//DD000118 DD  DCB=LRECL=16383K
//DD000119 DD  DCB=LRECL=X
//DD000120 DD  DCB=LRECL=&LRECL
//DD000121 DD  DCB=(RESERVE=(0,0),
//             PCI=(A,A))
//DD000122 DD  DCB=MODE=E
//DD000123 DD  DCB=MODE=O
//DD000124 DD  DCB=MODE=R
//DD000125 DD  DCB=MODE=CO
//DD000126 DD  DCB=MODE=RC
//DD000127 DD  DCB=MODE=RE
//DD000128 DD  DCB=MODE=CEOR
//DD000129 DD  DCB=MODE=&MODE
//DD000130 DD  DCB=(OPTCD=Z,
//             TRTCH=COMP,MODE=CEOR)
//DD000131 DD  DCB=NCP=255
//DD000132 DD  DCB=NCP=&NCP
//DD000133 DD  DCB=(TRTCH=T,
//             TRTCH=COMP,
//             TRTCH=NOCOMP)
//DD000134 DD  DCB=NTM=255
//DD000135 DD  DCB=NTM=&NTM
//DD000136 DD  DCB=(PCI=(N,N),
//             RESERVE=(0,0))
//DD000137 DD  DCB=OPTCD=C
//DD000138 DD  DCB=OPTCD=W
//DD000139 DD  DCB=OPTCD=AEFW
//DD000140 DD  DCB=OPTCD=B
//DD000141 DD  DCB=OPTCD=T
//DD000142 DD  DCB=OPTCD=ZCTBU
//DD000143 DD  DCB=OPTCD=&OPTCD
//DD000144 DD  DCB=(PRTSP=3,
//             OPTCD=B)
//DD000145 DD  DCB=PCI=(N,N)
//DD000146 DD  DCB=PCI=A
//DD000147 DD  DCB=PCI=(A)
//DD000148 DD  DCB=PCI=(A,A)
//DD000149 DD  DCB=PCI=&PCI
//DD000150 DD  DCB=PCI=(&PCI)
//DD000151 DD  DCB=PCI=(&PCI1,R)
//DD000152 DD  DCB=PCI=(R,&PCI2)
//DD000153 DD  DCB=PCI=(&PCI1,&PCI2)
//DD000154 DD  DCB=PRTSP=0
//DD000155 DD  DCB=PRTSP=1
//DD000156 DD  DCB=PRTSP=2
//DD000157 DD  DCB=PRTSP=3
//DD000158 DD  DCB=PRTSP=&PRTSP
//DD000159 DD  DCB=RECFM=F
//DD000160 DD  DCB=RECFM=FB
//DD000161 DD  DCB=RECFM=FBS
//DD000162 DD  DCB=RECFM=FBT
//DD000163 DD  DCB=RECFM=U
//DD000164 DD  DCB=RECFM=UTM
//DD000165 DD  DCB=RECFM=UA
//DD000166 DD  DCB=RECFM=VBS
//DD000167 DD  DCB=RECFM=FBA
//DD000168 DD  DCB=RECFM=VBA
//DD000169 DD  DCB=RECFM=DBSAUFMTV
//DD000170 DD  DCB=RECFM=&RECFM
//DD000171 DD  DCB=(RECFM=VBS,
//             RECFM=U)
//DD000172 DD  DCB=RESERVE=(255,255)
//DD000173 DD  DCB=RESERVE=(&RESERVE,255)
//DD000174 DD  DCB=RESERVE=(255,&RESERVE)
//DD000175 DD  DCB=RESERVE=(&RESERVE1,&RESERVE2)
//DD000176 DD  DCB=(LRECL=2K,
//             RECFM=U,
//             OPTCD=A)
//DD000177 DD  DCB=RKP=255
//DD000178 DD  DCB=RKP=&RKP
//DD000179 DD  DCB=(OPTCD=B,
//             OPTCD=C,
//             OPTCD=Z)
//DD000180 DD  DCB=STACK=2
//DD000181 DD  DCB=STACK=32768
//DD000182 DD  DCB=STACK=&STACK
//DD000183 DD  DCB=(STACK=1,
//             RECFM=U,
//             THRESH=77)
//DD000184 DD  DCB=THRESH=255
//DD000185 DD  DCB=THRESH=&THRESH
//DD000186 DD  DCB=THRESH=95
//DD000187 DD  DCB=(TRTCH=ET,
//             RESERVE=(9,9))
//DD000188 DD  DCB=TRTCH=E
//DD000189 DD  DCB=TRTCH=T
//DD000190 DD  DCB=TRTCH=ET
//DD000191 DD  DCB=TRTCH=COMP
//DD000192 DD  DCB=TRTCH=NOCOMP
//DD000193 DD  DCB=TRTCH=&TRTCH
