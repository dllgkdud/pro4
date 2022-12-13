-- sample 테이블
create table sample (
    id varchar2(20),
    pw varchar2(50)
)
select * from sample;

-- 더미데이터
insert into sample values ('admin', '1234');
insert into sample values ('lhy', '1111');

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
select userid, userpw, username from mem where userid = 'admin';
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
drop table board;


-- data 테이블(사진 혹은 자료를 업로드하는 자료게시판 테이블 - 자료번호, 자료제목, 자료내용, 자료이미지, 자료파일, 작성자, 조회수, 자료등록일)
create table data (
    dno number primary key,
    dtitle varchar2(300) not null,
    dcontent varchar2(1000) not null,
    author VARCHAR2(50),
    visited number default 0,
    regdate date default sysdate
);
desc data;
select * from data;
drop table data;

-- qna 테이블(글번호, 글제목, 글내용, 작성자, 작성일, 조회수, 글그룹번호, 답변수준, 글깊이)
create table qna(
    qno number primary key,
    qtitle varchar2(300) not null,
    qcontent varchar2(1000) not null,
    qauthor varchar2(100) not null,
    regdate date default sysdate,
    visited number default 0,
    qgroup number,
    qstep number,
    qindent number
);
desc qna;
select * from qna;
drop table qna;

-- news 테이블(사진 및 문서를 업로드하는 홍보 테이블 - 홍보번호, 홍보제목, 홍보내용, 이미지, 자료파일, 홍보등록일)
create table news (
    nno number primary key,
    ntitle varchar2(300) not null,
    ncontent varchar2(3000) not null,
    regdate date default sysdate
);
desc news;
select * from news;
drop table news;

-- 더미데이터
insert into news values(1, '네이버웹툰, 2022년 결산 서비스 ‘2022 위드 웹툰(with WEBTOON) 나의 웹툰 리포트’ 공개', 
'네이버웹툰과 시리즈는 오늘(12일)부터 31일까지 웹과 앱 이용자 개개인의 열람 이력을 분석한 ‘2022 위드 웹툰 나의 웹툰 리포트(이하, ‘웹툰 리포트’)’와 ‘2022 위드 시리즈, 나의 시리즈 리포트(이하, ‘시리즈 리포트’)’를 앱(APP)에서 각각 공개한다. 
이번 리포트는 2022년 1월부터10월까지 이용자의 열람 이력을 분석해 맞춤형 연말 결산 데이터를 제공한 것이 특징이다. ', sysdate);
insert into news values((select nvl(max(seq),0)+1 from board), '샘플로 작성한 제목2', '샘플로 작성한 내용2입니다.', sysdate);

commit;