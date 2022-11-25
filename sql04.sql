desc member;
select * from member;

-- mem 테이블(member와 다름)
create table mem (
    userid varchar2(50) primary key,
    userpw varchar2(300) not null,
    username varchar2(50),
    birth date,
    email varchar2(100) not null,
    tel varchar2(13),
    addr1 varchar2(200),
    addr2 varchar2(200),
    postcode varchar2(10),
    userpt number default 10,
    visited number default 0,
    regdate date default sysdate
);
select * from mem;
select to_char(regdate, 'yyyy-MM-dd HH24:mi:ss') as cdate from mem;

-- board 테이블
create table board (
    seq int primary key,
    title varchar2(300) not null,
    content varchar2(1000) not null, 
    nick varchar2(50),
    regdate date default sysdate,
    visited int
);
desc board;
alter table board modify seq integer;


-- 더미데이터
insert into board values(1, '샘플로 작성한 제목1', '샘플로 작성한 내용1입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq),0)+1 from board), '샘플로 작성한 제목2', '샘플로 작성한 내용2입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq),0)+1 from board), '샘플로 작성한 제목3', '샘플로 작성한 내용3입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq),0)+1 from board), '샘플로 작성한 제목4', '샘플로 작성한 내용4입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq),0)+1 from board), '샘플로 작성한 제목5', '샘플로 작성한 내용5입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq),0)+1 from board), '샘플로 작성한 제목6', '샘플로 작성한 내용6입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq),0)+1 from board), '샘플로 작성한 제목7', '샘플로 작성한 내용7입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq),0)+1 from board), '샘플로 작성한 제목8', '샘플로 작성한 내용8입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq),0)+1 from board), '샘플로 작성한 제목9', '샘플로 작성한 내용9입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq),0)+1 from board), '샘플로 작성한 제목10', '샘플로 작성한 내용10입니다.', 'admin', sysdate, 0);
insert into board values((select nvl(max(seq),0)+1 from board), '샘플로 작성한 제목11', '샘플로 작성한 내용11입니다.', 'admin', sysdate, 0);

select * from board;
select * from board where cast(seq as integer)=3;
select * from board where to_number(seq)=3;


-- free 테이블(사진 혹은 자료를 업로드하는 자유게시판 테이블)
create table free (
    bno int primary key,
    title varchar2(300) not null,
    content varchar2(1000) not null,
    nick varchar2(50),
    regdate date default sysdate,
    visited int
);
desc free;
select * from free;
commit;