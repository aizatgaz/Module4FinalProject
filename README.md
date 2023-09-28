# Module4FinalProject
### Description
JavaRush module 4 final project.

The application uses MySQL, Hibernate, Redis, Docker.

Task: we have a MySQL relational database with a schema (country-city, language by country). And there is a frequent request from the city that is slowing down. We came up with a solution - to move all the data that is requested frequently into Redis (in memory storage of key-value type).

But I tweaked the code and made MySQL still faster. I think this can be done with Redis, but I don't know Redis very well.

Time measurements:

With p6spy:

Redis:	53 ms

MySQL:	58 ms

Without p6spy:

Redis:	52 ms

MySQL:	45 ms
