-- Create table
create table OYJR_RZHX.OA_QIN_ROLE8
(
  role_id          NUMBER(10) not null,
  role_name        VARCHAR2(50 CHAR) not null,
  role_description VARCHAR2(3000 CHAR) not null,
  role_isfull      NUMBER(1) not null,
  role_needpersons NUMBER(5) not null,
  role_publishtime TIMESTAMP(6) not null,
  role_endtime     TIMESTAMP(6) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table OYJR_RZHX.OA_QIN_ROLE8
  is '岗位信息表';
-- Add comments to the columns 
comment on column OYJR_RZHX.OA_QIN_ROLE8.role_id
  is '岗位编号';
comment on column OYJR_RZHX.OA_QIN_ROLE8.role_name
  is '岗位名称';
comment on column OYJR_RZHX.OA_QIN_ROLE8.role_description
  is '岗位描述';
comment on column OYJR_RZHX.OA_QIN_ROLE8.role_isfull
  is '岗位是否已招满';
comment on column OYJR_RZHX.OA_QIN_ROLE8.role_needpersons
  is '岗位需要多少人';
comment on column OYJR_RZHX.OA_QIN_ROLE8.role_publishtime
  is '岗位发布时间';
comment on column OYJR_RZHX.OA_QIN_ROLE8.role_endtime
  is '岗位结束是时间';
-- Create/Recreate primary, unique and foreign key constraints 
alter table OYJR_RZHX.OA_QIN_ROLE8
  add primary key (ROLE_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

  -- Create table
create table OYJR_RZHX.OA_QIN_FINDJOBPERSON_DEP8
(
  qin_findjobperson_depkey      NUMBER(10) not null,
  qin_findjobperson_depmany2one VARCHAR2(255 CHAR)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
-- Add comments to the table 
comment on table OYJR_RZHX.OA_QIN_FINDJOBPERSON_DEP8
  is '一个部门对应多个招聘人员';
-- Add comments to the columns 
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON_DEP8.qin_findjobperson_depkey
  is '对应人员key';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON_DEP8.qin_findjobperson_depmany2one
  is '对应人员many2one';
-- Create/Recreate primary, unique and foreign key constraints 
alter table OYJR_RZHX.OA_QIN_FINDJOBPERSON_DEP8
  add primary key (QIN_FINDJOBPERSON_DEPKEY)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table OYJR_RZHX.OA_QIN_FINDJOBPERSON_DEP8
  add constraint FK_FINDJOBPERSON_DEPARMENTKEY foreign key (QIN_FINDJOBPERSON_DEPKEY)
  references OYJR_RZHX.OA_QIN_FINDJOBPERSON8 (FINDJOBPERSON_ID);
alter table OYJR_RZHX.OA_QIN_FINDJOBPERSON_DEP8
  add constraint FK_FINDJOBPERSON_DEPMANY2ONE foreign key (QIN_FINDJOBPERSON_DEPMANY2ONE)
  references OYJR_RZHX.OA_QIN_DEPARTMENT8 (DEPARTMENT_ID);

  -- Create table
create table OYJR_RZHX.OA_QIN_FINDJOBPERSON8
(
  findjobperson_id               NUMBER(10) not null,
  jobpersonname                  VARCHAR2(5 CHAR) not null,
  jobpersongender                NUMBER(10) not null,
  jobpersonoldcompanyname        VARCHAR2(50 CHAR) not null,
  jobpersonoldjob                VARCHAR2(30 CHAR) not null,
  jobpersonstartjobtime          TIMESTAMP(6) not null,
  jobpersonjobname               VARCHAR2(50 CHAR) not null,
  jobpersonnowcity               VARCHAR2(5 CHAR) not null,
  jobpersonbirth                 DATE not null,
  jobpersonismarried             VARCHAR2(255 CHAR) not null,
  jobpersonmobile                NUMBER(19) not null,
  jobpersonemail                 VARCHAR2(40 CHAR) not null,
  jobpersoncountry               VARCHAR2(10 CHAR) not null,
  jobpersonlocation              VARCHAR2(50 CHAR) not null,
  jobpersonwantjob               VARCHAR2(30 CHAR) not null,
  jobpersonfunction              VARCHAR2(30 CHAR) not null,
  jobpersonwantlocation          VARCHAR2(10 CHAR) not null,
  jobpersonwantsyearsalary       FLOAT not null,
  jobpersonoldyearsalary         FLOAT not null,
  jobpersonexperiencecompanyname VARCHAR2(30 CHAR) not null,
  jobperexpcompanynature         VARCHAR2(10 CHAR) not null,
  jobpernexpcompanypeoplenumber  VARCHAR2(30 CHAR) not null,
  jobperexpcomsimpleintroduction VARCHAR2(1000 CHAR) not null,
  jobperexpcompanyjobname        VARCHAR2(50 CHAR) not null,
  jobpersonexpcompanylocation    VARCHAR2(30 CHAR) not null,
  jobperexpcomunderlingpeople    NUMBER(10),
  jobperexpcompanyjobtime        VARCHAR2(50 CHAR) not null,
  jobpeexpcompanydutyofwork      VARCHAR2(1000 CHAR) not null,
  jobperexpcompanyjobreporttowho VARCHAR2(40 CHAR) not null,
  jobperexpcompanymonthsalary    VARCHAR2(10 CHAR) not null,
  jobperexperiencecompanyscore   VARCHAR2(1000 CHAR) not null,
  jobpersonschoolname            VARCHAR2(30 CHAR),
  jobpersonmajorname             VARCHAR2(30 CHAR),
  jobpersonschoolstudytime       VARCHAR2(50 CHAR),
  jobpersonschoolrecord          VARCHAR2(4 CHAR),
  jobpersonprojectname           VARCHAR2(3000 CHAR),
  jobpersonprojectcompanyname    VARCHAR2(50 CHAR),
  jobpersonprojectfunction       VARCHAR2(50 CHAR),
  jobpersonprojectdotime         VARCHAR2(50 CHAR),
  jobpersonprojectdescription    VARCHAR2(3000 CHAR),
  jobpersonprojectduty           VARCHAR2(3000 CHAR),
  jobpersonprojectscore          VARCHAR2(3000 CHAR),
  jobpersonmyintroduction        VARCHAR2(1000 CHAR) not null,
  oa_qin_role_personsetkey       NUMBER(10),
  department_findjobpersonidkey  VARCHAR2(255 CHAR)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
-- Add comments to the table 
comment on table OYJR_RZHX.OA_QIN_FINDJOBPERSON8
  is '招聘人员信息表';
-- Add comments to the columns 
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.findjobperson_id
  is '招聘人员编号';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonname
  is '招聘人员名字';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersongender
  is '招聘人员性别';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonoldcompanyname
  is '以前公司名称';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonoldjob
  is '以前公司名称';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonstartjobtime
  is '开始工作年份';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonjobname
  is '职位名称';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonnowcity
  is '当前城市';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonbirth
  is '出生年份';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonismarried
  is '婚姻状况';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonmobile
  is '手机';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonemail
  is '邮箱';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersoncountry
  is '国籍';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonlocation
  is '户口';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonwantjob
  is '期望行业';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonfunction
  is '期望职能';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonwantlocation
  is '期望地点';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonwantsyearsalary
  is '期望年薪';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonoldyearsalary
  is '以前年薪';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonexperiencecompanyname
  is '公司名称';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobperexpcompanynature
  is '公司性质';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpernexpcompanypeoplenumber
  is '公司规模';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobperexpcomsimpleintroduction
  is '公司简介';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobperexpcompanyjobname
  is '职位名称';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonexpcompanylocation
  is '工作地点';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobperexpcomunderlingpeople
  is '下属人数';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobperexpcompanyjobtime
  is '任职时间';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpeexpcompanydutyofwork
  is '工作职责';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobperexpcompanyjobreporttowho
  is '汇报对象';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobperexpcompanymonthsalary
  is '月薪';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobperexperiencecompanyscore
  is '工作业绩';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonschoolname
  is '学校名称';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonmajorname
  is '专业名称';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonschoolstudytime
  is '就读时间';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonschoolrecord
  is '学历';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonprojectname
  is '项目描述';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonprojectcompanyname
  is '公司名称';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonprojectfunction
  is '项目职务';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonprojectdotime
  is '项目时间';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonprojectdescription
  is '项目描述';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonprojectduty
  is '项目职责';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonprojectscore
  is '项目业绩';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.jobpersonmyintroduction
  is '自我评价';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.oa_qin_role_personsetkey
  is '所在部门fk';
comment on column OYJR_RZHX.OA_QIN_FINDJOBPERSON8.department_findjobpersonidkey
  is '所在部门many2one';
-- Create/Recreate primary, unique and foreign key constraints 
alter table OYJR_RZHX.OA_QIN_FINDJOBPERSON8
  add primary key (FINDJOBPERSON_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table OYJR_RZHX.OA_QIN_FINDJOBPERSON8
  add constraint FK_DEPARTMENTJOBPERSONSET foreign key (DEPARTMENT_FINDJOBPERSONIDKEY)
  references OYJR_RZHX.OA_QIN_DEPARTMENT8 (DEPARTMENT_ID);
alter table OYJR_RZHX.OA_QIN_FINDJOBPERSON8
  add constraint FK_QIN_ROLE_PERSONSETKEY foreign key (OA_QIN_ROLE_PERSONSETKEY)
  references OYJR_RZHX.OA_QIN_ROLE8 (ROLE_ID);

  -- Create table
create table OYJR_RZHX.OA_QIN_EMPLOYEE_ELSEAL8
(
  qin_employee_elsealkey      NUMBER(10) not null,
  qin_employee_elsealmany2one NUMBER(10)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
-- Add comments to the table 
comment on table OYJR_RZHX.OA_QIN_EMPLOYEE_ELSEAL8
  is '员工对应的电子公章表';
-- Add comments to the columns 
comment on column OYJR_RZHX.OA_QIN_EMPLOYEE_ELSEAL8.qin_employee_elsealkey
  is '员工对应的电子公章key';
comment on column OYJR_RZHX.OA_QIN_EMPLOYEE_ELSEAL8.qin_employee_elsealmany2one
  is '员工对应的电子公章many2one';
-- Create/Recreate primary, unique and foreign key constraints 
alter table OYJR_RZHX.OA_QIN_EMPLOYEE_ELSEAL8
  add primary key (QIN_EMPLOYEE_ELSEALKEY)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table OYJR_RZHX.OA_QIN_EMPLOYEE_ELSEAL8
  add constraint FK_EMPLOYEEELSEALKEY foreign key (QIN_EMPLOYEE_ELSEALKEY)
  references OYJR_RZHX.OA_QIN_EMPLOYEE8 (EMPLOYEE_ID);
alter table OYJR_RZHX.OA_QIN_EMPLOYEE_ELSEAL8
  add constraint FK_EMPLOYEEELSEALMANY2ONE foreign key (QIN_EMPLOYEE_ELSEALMANY2ONE)
  references OYJR_RZHX.OA_QIN_EMPLOYEE8 (EMPLOYEE_ID);

  -- Create table
create table OYJR_RZHX.OA_QIN_EMPLOYEE8
(
  employee_id         NUMBER(10) not null,
  employeename        VARCHAR2(20 CHAR) not null,
  employeegender      NUMBER(10) not null,
  employeeage         NUMBER(10) not null,
  employeedescription VARCHAR2(3000 CHAR) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table OYJR_RZHX.OA_QIN_EMPLOYEE8
  is '员工信息表';
-- Add comments to the columns 
comment on column OYJR_RZHX.OA_QIN_EMPLOYEE8.employee_id
  is '员工编号';
comment on column OYJR_RZHX.OA_QIN_EMPLOYEE8.employeename
  is '员工姓名';
comment on column OYJR_RZHX.OA_QIN_EMPLOYEE8.employeegender
  is '员工性别';
comment on column OYJR_RZHX.OA_QIN_EMPLOYEE8.employeeage
  is '员工年龄';
comment on column OYJR_RZHX.OA_QIN_EMPLOYEE8.employeedescription
  is '员工描述';
-- Create/Recreate primary, unique and foreign key constraints 
alter table OYJR_RZHX.OA_QIN_EMPLOYEE8
  add primary key (EMPLOYEE_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

  -- Create table
create table OYJR_RZHX.OA_QIN_ELSEAL8
(
  elseal_id          NUMBER(10) not null,
  elseal_title       VARCHAR2(50 CHAR) not null,
  elseal_description VARCHAR2(3000 CHAR) not null,
  elseal_createtime  TIMESTAMP(6),
  elseal_path        VARCHAR2(540 CHAR) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table OYJR_RZHX.OA_QIN_ELSEAL8
  is '电子公章表';
-- Add comments to the columns 
comment on column OYJR_RZHX.OA_QIN_ELSEAL8.elseal_id
  is '公章主键';
comment on column OYJR_RZHX.OA_QIN_ELSEAL8.elseal_title
  is '公章标题';
comment on column OYJR_RZHX.OA_QIN_ELSEAL8.elseal_description
  is '公章描述';
comment on column OYJR_RZHX.OA_QIN_ELSEAL8.elseal_createtime
  is '公章创建时间';
comment on column OYJR_RZHX.OA_QIN_ELSEAL8.elseal_path
  is '公章路径';
-- Create/Recreate primary, unique and foreign key constraints 
alter table OYJR_RZHX.OA_QIN_ELSEAL8
  add primary key (ELSEAL_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

  -- Create table
create table OYJR_RZHX.OA_QIN_DEPARTMENT_PARENT8
(
  qin_department_parent8idkey VARCHAR2(255 CHAR) not null,
  qin_dep_parentmany2one      VARCHAR2(255 CHAR)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table OYJR_RZHX.OA_QIN_DEPARTMENT_PARENT8
  is '部门对应的上级部门表(与上级部门多对一)';
-- Add comments to the columns 
comment on column OYJR_RZHX.OA_QIN_DEPARTMENT_PARENT8.qin_department_parent8idkey
  is '对应的上级部门key';
comment on column OYJR_RZHX.OA_QIN_DEPARTMENT_PARENT8.qin_dep_parentmany2one
  is '对应的上级部门many2one标签';
-- Create/Recreate primary, unique and foreign key constraints 
alter table OYJR_RZHX.OA_QIN_DEPARTMENT_PARENT8
  add primary key (QIN_DEPARTMENT_PARENT8IDKEY)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table OYJR_RZHX.OA_QIN_DEPARTMENT_PARENT8
  add constraint FK_DEPA_PARENTKEY foreign key (QIN_DEPARTMENT_PARENT8IDKEY)
  references OYJR_RZHX.OA_QIN_DEPARTMENT8 (DEPARTMENT_ID);
alter table OYJR_RZHX.OA_QIN_DEPARTMENT_PARENT8
  add constraint FK_DEP_PARENTMANY2ONE foreign key (QIN_DEP_PARENTMANY2ONE)
  references OYJR_RZHX.OA_QIN_DEPARTMENT8 (DEPARTMENT_ID);

  -- Create table
create table OYJR_RZHX.OA_QIN_DEPARTMENT8
(
  department_id             VARCHAR2(255 CHAR) not null,
  departmentname            VARCHAR2(30 CHAR) not null,
  departmentdescription     VARCHAR2(3000 CHAR),
  department_childrensetkey VARCHAR2(255 CHAR)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table 
comment on table OYJR_RZHX.OA_QIN_DEPARTMENT8
  is '部门信息表';
-- Add comments to the columns 
comment on column OYJR_RZHX.OA_QIN_DEPARTMENT8.department_id
  is '部门主键';
comment on column OYJR_RZHX.OA_QIN_DEPARTMENT8.departmentname
  is '部门名称';
comment on column OYJR_RZHX.OA_QIN_DEPARTMENT8.departmentdescription
  is '部门描述';
comment on column OYJR_RZHX.OA_QIN_DEPARTMENT8.department_childrensetkey
  is '对应的子部门key标签';
-- Create/Recreate primary, unique and foreign key constraints 
alter table OYJR_RZHX.OA_QIN_DEPARTMENT8
  add primary key (DEPARTMENT_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table OYJR_RZHX.OA_QIN_DEPARTMENT8
  add constraint FK_DEPARTMENTCHILDRENSET foreign key (DEPARTMENT_CHILDRENSETKEY)
  references OYJR_RZHX.OA_QIN_DEPARTMENT8 (DEPARTMENT_ID);

  