-- 코드를 입력하세요
SELECT ANIMAL_TYPE,  if(NAME IS NULL,"No name", NAME) NAME, SEX_UPON_INTAKE
from animal_ins
order by animal_id