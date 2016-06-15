# NFS Notes

## Instruction

### NFS Ubuntu

[Setup NFS server on ubuntu 14.04] (http://www.krizna.com/ubuntu/setup-nfs-server-ubuntu-14-04/)

[NFSv4Howto] (https://help.ubuntu.com/community/NFSv4Howto)

**/etc/exports**

Insecure share on all networks.

``` bash
/sdata        *(rw,sync,no_root_squash)

sudo service nfs-kernel-server restart

sudo exportfs -u
```

### NFS4J

**Github**




