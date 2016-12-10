@ECHO OFF

IF NOT EXIST bin mkdir bin

CALL scalac src/Main.scala -d bin