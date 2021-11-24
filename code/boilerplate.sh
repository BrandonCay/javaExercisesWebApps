read exName;
mkdir "${exName}";

inputFileName=p
stdoutFileName=${inputFileName}
stderrFileName=err
rfileName=run
defaultJavaFileName=main


./setRunFile.sh
${rfileName}

echo ${runFileName}

cd "${exName}";

touch ${inputFileName}.dat ${stdoutFileName}.out ${stderrFileName}.out ${defaultJavaFileName}.java ${runFileName}.sh;

cd ..

#copy files into 
cat runJavaBP.sh > /${exName}/${runFileName}.sh
cat rmBadChars.sh > /${exName}/rmBadChars.sh
