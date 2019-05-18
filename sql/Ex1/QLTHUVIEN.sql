CREATE DATABASE IF NOT EXISTS QLTHUVIEN;

USE qlthuvien;

CREATE TABLE SACH
(
	masach int PRIMARY KEY NOT null,
    ten char(30),
    tacgia char(30),
    nxb char(30),
    soluong int
);

CREATE TABLE DOCGIA
(
	sothe int PRIMARY KEY NOT null,
    ten char(30),
    khoa char(30),
    khoahoc char(30),
    thoihanthe date
);

CREATE TABLE PHIEUMUON
(
	masach int NOT NULL,
    sothe int NOT null,
    ngaymuon date,
    ngaytra date,
    ghichu char(30),
    PRIMARY KEY(masach, sothe),
    foreign key (masach)
		references SACH(masach)
        ON DELETE cascade
);

////////////////////////////////////////////////////////

INSERT INTO `sach`
(`masach`, `ten`, `tacgia`, `nxb`, `soluong`)
VALUES
(1, 'sach_1', 'tg_1', 'nxb_1', 10),
(2, 'sach_2', 'tg_2', 'nxb_2', 10),
(3, 'sach_3', 'tg_3', 'nxb_3', 10),
(4, 'sach_4', 'tg_4', 'nxb_4', 10),
(5, 'sach_5', 'tg_5', 'nxb_5', 10);

INSERT INTO `docgia`
(`sothe`, `ten`, `khoa`, `khoahoc`, `thoihanthe`)
VALUES
(1, 'sv_1','khoa_1', 'khoa_1', '2021-06-25'),
(2, 'sv_2','khoa_2', 'khoa_2', '2020-09-14'),
(3, 'sv_3','khoa_3', 'khoa_3', '2021-07-20'),
(4, 'sv_4','khoa_4', 'khoa_4', '2021-05-12'),
(5, 'sv_5','khoa_5', 'khoa_5', '2021-01-05');

INSERT INTO `phieumuon`
(`masach`, `sothe`, `ngaymuon`, `ngaytra`, `ghichu`)
VALUES
(1, 1, '2019-06-25', '2019-12-25', 'not ghi chu'),
(2, 2, '2019-09-14', '2019-12-25', 'not ghi chu'),
(3, 3, '2019-07-20', '2019-12-25', 'not ghi chu'),
(4, 4, '2019-05-12', '2019-12-25', 'not ghi chu'),
(5, 5, '2019-01-05', '2019-12-25', 'not ghi chu');

/////////////////////////////////////////////////////////////

DELETE FROM sach WHERE masach = 5;
update sach set soluong = 5 where masach = 4;

select ten, khoa from docgia;

/////////////////////////////////////////////////////////////

select docgia.ten
from docgia inner join phieumuon, sach
where docgia.sothe = phieumuon.sothe and sach.masach = phieumuon.masach
		and phieumuon.ngaymuon = '2019-05-12' and sach.ten = 'sach_4';
        
select docgia.ten, sach.masach, sach.ten
from docgia inner join phieumuon, sach
where docgia.sothe = phieumuon.sothe and sach.masach = phieumuon.masach
		and month(phieumuon.ngaymuon) = 6;
       
/////////////////////////////////////////////////////////////////////////////
       
INSERT INTO `sach`
(`masach`, `ten`, `tacgia`, `nxb`, `soluong`)
VALUES
(6, 'sach_6', 'tg_6', 'nxb_6', 10),
(7, 'sach_7', 'tg_7', 'nxb_7', 10);

INSERT INTO `phieumuon`
(`masach`, `sothe`, `ngaymuon`, `ghichu`)
VALUES
(6, 6, '2019-03-02', 'not ghi chu');

INSERT INTO `docgia`
(`sothe`, `ten`, `khoa`, `khoahoc`, `thoihanthe`)
VALUES
(6, 'sv_6','khoa_6', 'khoa_6', '2021-06-25');

////////////////////////////////////////////////////////////////////////////////

select docgia.ten, docgia.sothe
from docgia inner join phieumuon
where docgia.sothe = phieumuon.sothe and phieumuon.ngaytra = null;