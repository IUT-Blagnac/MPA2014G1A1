@echo off
set ASCIIDOCDIR=../tools/asciidoc-8.6.9/
set PLANTUMLDIR=../tools/asciidoc-8.6.9/filters/plantuml/
set SPRINTDIR=%~dp0
set SRCDIR=./OPTIweb/MakeOPTIWeb/src/
set BINDIR=./OPTIweb/MakeOPTIWeb/bin/
set SRCDOCDIR=./OPTIweb/srcdoc/
set DOCDIR=./doc/

echo COMPILATION des librairies
javac -cp .;./tools/junit.jar;%BINDIR% -d %BINDIR% %SRCDIR%Lecteur.java
javac -cp .;./tools/junit.jar;%BINDIR% -d %BINDIR% %SRCDIR%Etudiant.java
javac -cp .;./tools/junit.jar;%BINDIR% -d %BINDIR% %SRCDIR%Intervenant.java
javac -cp .;./tools/junit.jar;%BINDIR% -d %BINDIR% %SRCDIR%Sujet.java
javac -cp .;./tools/junit.jar;%BINDIR% -d %BINDIR% %SRCDIR%Projet.java

pause
echo COMPILATION des librairies reussie


echo COMPILATION des executables

javac -cp .;./tools/junit.jar;%BINDIR% -d %BINDIR% %SRCDIR%MakeOPTIweb.java
echo COMPILATION des executables reussie
pause

rem echo COMPILATION des tests
rem javac -cp .;tools/junit.jar;%BINDIR% -d %BINDIR% %SRCDIR%MakeOPTIwebTest.java
rem echo COMPILATION des tests reussie

rem echo EXECUTION des tests
rem java -cp .;./tools/junit.jar;%BINDIR% MakeOPTIwebTest

rem echo EXECUTION des tests reussie
rem pause


rem echo EXECUTION des executables

cd ./OPTIweb/MakeOPTIWeb
java "-Dfile.encoding=UTF-8" -classpath ./bin MakeOPTIweb


echo EXECUTION des executables reussie
pause
