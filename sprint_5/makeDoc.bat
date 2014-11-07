rem echo off
set ASCIIDOCDIR=../tools/asciidoc-8.6.9/
set PLANTUMLDIR=../tools/asciidoc-8.6.9/filters/plantuml/
set SPRINTDIR=%~dp0
set SRCDIR=./OPTIweb/MakeOPTIWeb/src/
set BINDIR=./OPTIweb/MakeOPTIWeb/bin/
set SRCDOCDIR=./OPTIweb/srcdoc/
set DOCDIR=./doc/

set MAKETEST=1


@echo ///////////////////////////////////////////////////////
@echo // COMPILATION des documentations
@echo ///////////////////////////////////////////////////////
rem java -jar %PLANTUMLDIR%plantuml.jar -Tpng -o images %SRCDOCDIR%diag0.puml

python %ASCIIDOCDIR%asciidoc.py -o %DOCDIR%UserDoc.html %SRCDOCDIR%UserDoc.txt
python %ASCIIDOCDIR%asciidoc.py -o %DOCDIR%TechDoc.html %SRCDOCDIR%TechDoc.txt

pause