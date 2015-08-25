select * from D_PS_STATUS a,v_gp b
where a.gp_id = b.gp_id
order by accept_time desc
