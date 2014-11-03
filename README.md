MPA2014G1A1
===========
[![Build Status](https://travis-ci.org/IUT-Blagnac/MPA2014G1A1.svg?branch=master)](https://travis-ci.org/IUT-Blagnac/MPA2014G1A1)

before_install:
  - wget http://algec.iut-blagnac.fr/~jmi/MPA/src/junit.jar
  - "sudo apt-get install graphviz 2>&1 | tail -n 2"
  - wget http://algec.iut-blagnac.fr/~jmi/MPA/src/plantuml.jar
  - hg clone -r 8.6.7 https://asciidoc.googlecode.com/hg/ asciidoc-8.6.7
language: java
script:
  - java -version
  - javac -version
  - python -V
  - phantomjs -v
  - python asciidoc-8.6.7/asciidoc.py --version
  - dot -V
  - echo Hello from DUT INFO Blagnac
  - ls -alF
  - cd sprint_5
  - javac -cp .:./bin -d ./bin ./src/HelloMonde.java
  - javac -cp .:./bin:../junit.jar -d ./bin ./src/HelloMondeTest.java
  - java -jar ../plantuml.jar -Tpng -o srcdoc/images srcdoc/diag0.puml
  - python ../asciidoc-8.6.7/asciidoc.py -a data-uri -o srcdoc/presentationFinale.html srcdoc/presentationFinale.txt
  - ls -alF srcdoc