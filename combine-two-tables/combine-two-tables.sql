# Write your MySQL query statement below
SELECT p.FirstName, p.LastName, ad.City, ad.State
FROM Person p
LEFT OUTER JOIN ADDRESS ad
ON p.PersonId = ad.PersonId;