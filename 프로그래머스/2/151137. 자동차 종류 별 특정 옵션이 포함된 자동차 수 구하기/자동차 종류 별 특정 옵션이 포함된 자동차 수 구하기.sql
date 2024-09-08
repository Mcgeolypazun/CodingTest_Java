-- 코드를 입력하세요
# SELECT CAR_TYPE, count(*) as CARS
# from CAR_RENTAL_COMPANY_CAR
# where OPTIONS like '%열선시트%' or OPTIONS like '%스마트키%' or OPTIONS like '%주차감지센서%'
# group by CAR_TYPE
# order by CAR_TYPE;


SELECT
    CAR_TYPE
    , COUNT(*) AS CARS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS REGEXP '통풍시트|열선시트|가죽시트'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE