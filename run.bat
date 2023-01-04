@echo off
set /p ID=


:loop
..\..\windows\jdk-18.0.1.1\bin\java.exe -classpath bin/ %ID%

PAUSE

goto loop