create table APP (
    app_id number(10) primary key,
    app_name varchar2(100) NOT NULL,
    comments varchar2(100),
    app_number varchar2(10) NOT NULL,
    app_type varchar2(20) NOT NULL,
    app_status varchar2(20) NOT NULL,
    start_date date DEFAULT (sysdate),
    end_date date DEFAULT (sysdate)
  );