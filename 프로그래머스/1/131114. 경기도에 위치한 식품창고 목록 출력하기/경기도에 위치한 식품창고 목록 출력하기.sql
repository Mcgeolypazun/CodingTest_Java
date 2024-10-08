-- 코드를 입력하세요
# SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, (FREEZER_YN, 'N') AS FREEZER_YN
# FROM FOOD_WAREHOUSE
# WHERE ADDRESS LIKE '%경기도%'
# ORDER BY WAREHOUSE_ID;

SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS,CASE WHEN
        FREEZER_YN IS NULL THEN 'N'
        ELSE FREEZER_YN END FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE WAREHOUSE_NAME LIKE '창고_경기%'
ORDER BY WAREHOUSE_ID;


