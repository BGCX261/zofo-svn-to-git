select * from pss.r_comm_log where logical_addr = '12070239' 
--and record_time between to_date('2011-08-31 0:00:00','YYYY-MM-DD HH24:MI:SS') and to_date('2011-08-31 23:59:00','YYYY-MM-DD HH24:MI:SS')
--and message='684A004A00685112965434000C80010108100000000001002816'
order by record_time desc

select * from pss.r_comm_log where logical_addr = '12070404' 
and record_time between to_date('2012-08-28 00:00:00','YYYY-MM-DD HH24:MI:SS') and to_date('2012-08-29 00:00:00','YYYY-MM-DD HH24:MI:SS')
order by record_time desc

select * from pss.r_comm_log where logical_addr = '96123452' 
--and record_time between to_date('2012-08-28 00:00:00','YYYY-MM-DD HH24:MI:SS') and to_date('2012-08-29 00:00:00','YYYY-MM-DD HH24:MI:SS')
order by record_time desc

select * from pss.r_comm_log where logical_addr = '12070299' 
order by record_time desc

select * from pss.r_comm_log where logical_addr = '10120055' 
and record_time between to_date('2011-08-22 00:00:00','YYYY-MM-DD HH24:MI:SS') and to_date('2011-08-23 00:00:00','YYYY-MM-DD HH24:MI:SS')
order by record_time desc

select distinct to_char(record_time,'YYYY-MM-DD HH24:MI') time,message from pss.r_comm_log where logical_addr = '10120005' 
and record_time between to_date('2011-08-17 00:00:00','YYYY-MM-DD HH24:MI:SS') and to_date('2011-08-17 23:59:59','YYYY-MM-DD HH24:MI:SS')
order by time desc

select * from pss.r_comm_log 
where logical_addr = '12070239' 
and record_time between sysdate-1/24 and sysdate
