@echo off
cls
echo "Escolha uma opção"
echo "================="
echo.
echo 1 - "Abrir Calculadora"
echo 2 - "Abrir Bloco de Notas"
echo 3 - "Sair"
echo.
choice /C 123 /M "Selecione 1, 2 ou 3" 

IF ERRORLEVEL == 3 GOTO END
IF ERRORLEVEL == 2 GOTO NOTEPAD
IF ERRORLEVEL == 1 GOTO CALC


:CALC
start calc.exe
goto END

:NOTEPAD
start notepad.exe
goto END

:END
echo Operacão finalizada
pause