
# Web Aplication MVC SpringBoot 
```
    1. Menambahkan dependency spring web & thymeleaf
    2. Menambahkan repo maven org.webjars = bootstrap & ebjars-locator-core dan integrasi bootstrap
    3. Mengirim data dari controller ke view
    4. Handling from submission
```
# Git
```
    git init
    git add .
    git status
    git commit -m "upload project"
    git remote add origin git@github.com:absormu/demo-mvc.git
    git push -u origin master

```

# Cara Setup Database #

1. Jalankan postgresql di docker

    ```
    docker run --rm \
            --name invoice-db \
            -e POSTGRES_DB=invoicedb \
            -e POSTGRES_USER=invoice \
            -e POSTGRES_PASSWORD=z7BOE4aIKq2JP3VCLz7o \
            -e PGDATA=/var/lib/postgresql/data/pgdata \
            -v "$PWD/invoicedb-data:/var/lib/postgresql/data" \
            -p 5432:5432 \
            postgres:13
            
   
            psql -h 127.0.0.1 -U invoice invoicedb
            docker exec -it invoice-db psql -d invoicedb -U invoice
            pg_dump -h 127.0.0.1 -U invoice invoicedb
            docker exec -it invoice-db pg_dump -h 127.0.0.1 -U invoice invoicedb
    ```