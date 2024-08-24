-- 코드를 입력하세요
SELECT left(product_code,2), count(*) from product
group by SUBSTR(PRODUCT_CODE, 1,2)
order by product_code;