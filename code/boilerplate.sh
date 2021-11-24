read exName
mkdir "${exName}"

inputFileName=p
stdoutFileName=${inputFileName}
stderrFileName=err
defaultJavaFileName=main
runFileName=run
export runfileName

cd "${exName}"

touch ${inputFileName}.dat ${stdoutFileName}.out ${stderrFileName}.out ${defaultJavaFileName}.java ${runFileName}.sh \
${runFileName}.sh rmBadChars.sh

cd ..

#copy files into
cat runJavaBP.sh >${exName}/${runFileName}.sh
cat rmBadCharsBP.sh >${exName}/rmBadChars.sh
echo "" >${exName}/README.txt
echo "Boilerplate fin"
