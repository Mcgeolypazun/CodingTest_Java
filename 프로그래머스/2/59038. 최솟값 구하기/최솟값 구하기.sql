-- 코드를 입력하세요
SELECT DATETIME from ANIMAL_INS
where datetime <= all(select datetime from animal_ins);