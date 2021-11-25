mainFileName="main"
declare arr=(c1 c2 i1 m2)
for i in "${arr[@]}"
do
cd ${i}
./${mainFileName}.sh
cd ..
done;
