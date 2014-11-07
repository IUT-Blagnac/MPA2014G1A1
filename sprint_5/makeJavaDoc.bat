rem @echo off
set SPRINTDIR=%~dp0
set SRCDIR=./OPTIweb/MakeOPTIWeb/src/
set BINDIR=./OPTIweb/MakeOPTIWeb/bin/
set SRCDOCDIR=./OPTIweb/srcdoc/
set DOCDIR=./doc/
mkdir .\doc\javadoc


echo GENERATION javaDoc

cd ./doc/javadoc
javadoc %SRCDIR%/*.java

cd %SPRINTDIR%
echo GENERATION javaDoc reussie
pause