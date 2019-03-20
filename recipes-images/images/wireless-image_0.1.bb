DESCRIPTION = "A full-featured-console-only image with wireless capabilities"

IMAGE_FEATURES += "splash ssh-server-openssh"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    hostapd \
    wpa-supplicant \
    "

inherit core-image
