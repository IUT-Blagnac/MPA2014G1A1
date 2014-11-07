@echo off

set SPRINTDIR=%~dp0
set SRCDIR=./OPTIweb/MakeOPTIWeb/src/
set BINDIR=./OPTIweb/MakeOPTIWeb/bin/
set MAKETEST=1

echo COMPILATION des tests

if "%MAKETEST%"=="1" (
 	javac -cp .;tools/junit.jar;%BINDIR% -d %BINDIR% %SRCDIR%MakeOPTIwebTest.java
)
echo COMPILATION des tests reussie

echo EXECUTION des tests
	java -cp .;./tools/junit.jar;%BINDIR% MakeOPTIwebTest
echo EXECUTION des tests reussie