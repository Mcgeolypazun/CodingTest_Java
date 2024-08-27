-- 코드를 입력하세요
SELECT ANIMAL_TYPE, COUNT(*) FROM ANIMAL_INS
where animal_type = 'Cat' or animal_type = 'Dog'
GROUP BY ANIMAL_TYPE
order by animal_type asc;