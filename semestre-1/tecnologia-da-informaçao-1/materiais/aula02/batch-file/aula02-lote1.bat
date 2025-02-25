@echo off
cls
echo "Teste de arquivos de lote"
echo.
echo "Opcoes"
echo "======"
echo.
echo "A-Copiar para Documentos"
echo "B-Copiar para Backup"
echo "C-Finaliar"
echo.
choice /C ABC /M "Selecione A, B ou C" 
IF ERRORLEVEL == 3 GOTO END
IF ERRORLEVEL == 2 GOTO OP2
IF ERRORLEVEL == 1 GOTO OP1

:OP1
copy *.* e:\unip\msdos\documentos
echo "Teclou A"
GOTO END
:OP2
copy *.* e:\unip\msdos\backup
echo "Teclou B"
GOTO END

:END
echo "Batch Finalizado"
pause

