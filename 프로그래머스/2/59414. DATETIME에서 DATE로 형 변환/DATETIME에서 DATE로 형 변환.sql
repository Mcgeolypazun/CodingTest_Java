-- 코드를 입력하세요
SELECT ANIMAL_ID , NAME, DATE_FORMAT(DATETIME,'%Y-%m-%d') as DATETIME from animal_ins
order by animal_id;