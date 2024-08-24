-- 코드를 입력하세요
SELECT count(*) as USERS from user_info
where YEAR(JOINED) = 2021 and age between 20 and 29;